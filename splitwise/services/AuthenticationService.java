package splitwise.services;

import splitwise.models.User;

public class AuthenticationService {
    boolean authenticateUser (String id, String password) {
        UserService userService = UserService.userService();
        User u = userService.getUserById (id);
        if (u.getPassword() == password) {
            return true;
        }
        return false;
    }
}