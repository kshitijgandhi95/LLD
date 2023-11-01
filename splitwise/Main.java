package splitwise;

import java.util.ArrayList;

import splitwise.models.EqualSplitStrategy;
import splitwise.models.Expense;
import splitwise.models.Group;
import splitwise.models.SplitStrategy;
import splitwise.models.User;
import splitwise.services.ExpenseService;
import splitwise.services.GroupService;
import splitwise.services.UserService;

public class Main {
    public static void main(String[] args) {
        UserService us = UserService.userService();
        User u1 = us.registerUser ("Kshitij", "7808", "123");
        User u2 = us.registerUser ("Kshitij2", "7809", "124");
        
        SplitStrategy s = new EqualSplitStrategy();
        ArrayList<User> arr = new ArrayList<>();
        arr.add(u1);
        arr.add(u2);

        ExpenseService es = new ExpenseService();
        es.creatExpense(100, arr, s, u2, "First expense");
        System.out.println("Expense owned " + es.getTotalOwedAmount(u2));
        
        Group g = new Group(u2, "G1", "G1 group");
        g.addMember(u2, u1);

        Expense ge = es.creatExpense(100, arr, s, u2, "First expense");
        GroupService gs = GroupService.groupService();
        gs.addExpense(g, ge);
        System.out.println("Expense owned " + es.getTotalOwedAmount(u1));
        System.out.println("Transaction history " + es.getExpenseHistory(u1));
    }
}
