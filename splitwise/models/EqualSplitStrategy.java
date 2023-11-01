package splitwise.models;

import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

public class EqualSplitStrategy implements SplitStrategy {

    @Override
    public HashMap<User, Double> split(Expense e) {
        int amount = e.getAmount();
        List<User> users = e.getUsers();
        int totalUsers = users.size();
        Double splitAmount =  ((double)amount/(double)totalUsers);
        HashMap<User, Double> retMap = new HashMap<>();
        ListIterator<User> it = users.listIterator();
        while (it.hasNext()) {
            retMap.put(it.next(), splitAmount);
        }
        return retMap;
    }
    
}
