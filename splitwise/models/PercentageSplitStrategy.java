package splitwise.models;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class PercentageSplitStrategy implements SplitStrategy {
    private Map<User, Double> map;

    PercentageSplitStrategy (Map<User, Double> map) {
        this.map = map;
    }

    @Override
    public HashMap<User, Double> split(Expense e) {
        //add check and exception for total percent to be 100
        int amount = e.getAmount();
        List<User> users = e.getUsers();
        
        HashMap<User, Double> retMap = new HashMap<>();
        ListIterator<User> it = users.listIterator();
        while (it.hasNext()) {
            User u = it.next();
            retMap.put(u, getAmountForUser(u, amount));
        }
        return retMap;
    }

    private Double getAmountForUser (User u, int amount) {
        Double percent = map.get(u);
        return ((double) amount*(double) percent)/100; 
    }
    
}
