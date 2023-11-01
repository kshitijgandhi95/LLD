package splitwise.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

import splitwise.models.Expense;
import splitwise.models.User;

public class UserService {
    private List<User> users = new ArrayList<>();
    private static UserService userService;

    private UserService () {
        
    }

    public static UserService userService () {
        if (userService == null) {
            userService = new UserService();
        }
        return userService;
    }

    public User registerUser (String name, String phoneNumber, String password) {
        User user = new User(name, phoneNumber, password);
        users.add (user);  
        return user; 
    }

    //throw error
    public User updateUser (String id, String oldPassword, HashMap<String, String> updates) {
        AuthenticationService as = new AuthenticationService();
        if (!as.authenticateUser(id, oldPassword)) {
            return getUserById(id);
        }
        User u = getUserById(id);
        return updateUser(u, updates);
    }

    private User updateUser (User u, HashMap<String, String> updates) {
        for (String k: updates.keySet()) {
            if (k == "name") {
                u.setName(updates.get(k));
            }
            else if (k == "password") {
                u.setPassword(updates.get(k));
            }
            else if (k == "phoneNumber") {
                u.setPhoneNumber(updates.get(k));
            }
            else {
                //throw error
            }
        }
        return u;
    }

    public User getUserById (String id) {
        ListIterator<User> li = users.listIterator(); 
        while (li.hasNext()) {
            User u = li.next();
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    public boolean addExpense (User u, Expense  e) {
        u.addExpense(e);
        return true;
    }
}
