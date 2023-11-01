package splitwise.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import splitwise.models.Expense;
import splitwise.models.Group;
import splitwise.models.User;

public class GroupService {
    private List<Group> groups = new ArrayList<>();
    private static GroupService groupService;
    
    private GroupService () {

    }

    public static GroupService groupService () {
        if (groupService == null) {
            groupService = new GroupService();
        }
        return groupService;
    }

    public void createGroup (User user, String name, String description) {
        Group grp = new Group(user, name, description);
        groups.add(grp);
    }

    public boolean addMember (User admin, User u, Group grp) {
        return grp.addMember(admin, u);
    }

    public boolean addExpense (Group g, Expense e) {
        Iterator<Group> it = groups.listIterator();
        while (it.hasNext()) {
            Group grp = it.next();
            if (grp == g) {
                grp.addExpense (e);
                return true;
            }
        }
        return false;
    }
}
