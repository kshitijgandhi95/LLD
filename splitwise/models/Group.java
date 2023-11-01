package splitwise.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group {
    private List<User> users = new ArrayList<>();
    private String name;
    private String description;
    private User admin;
    private List<Expense> expenses = new ArrayList<>();

    public Group (User user, String name, String description) {
        this.name = name;
        this.description = description;
        this.admin = user;
        users.add (user);
    }

    public boolean addMember (User admin, User user) {
        if (this.admin == admin && !isMember(user)) {
            users.add (user);
            return true;
        }
        //throw exception
        return false;
    }

    public boolean isMember (User u) {
        Iterator<User> it = users.iterator();
        while (it.hasNext()) {
            User user = it.next();
            if (user == u) {
                return true;
            }
        }
        return false;
    }

    public List<Expense> getExpenses () {
        return this.expenses;
    }

    public void addExpense (Expense e) {
        expenses.add(e);
    }

    //getters and setters
}
