package splitwise.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import splitwise.models.Expense;
import splitwise.models.Group;
import splitwise.models.SplitStrategy;
import splitwise.models.User;

public class ExpenseService {
    public double getTotalOwedAmount(User u) {
        List<Expense> expenses = u.getExpenses();
        ListIterator<Expense> it = expenses.listIterator();
        double amountSpent = 0;
        double amountOwed = 0;
        System.out.println("here ");
        while (it.hasNext()) {
            System.out.println("here 2");
            Expense e = it.next();
            if (e.getPayer() == u) {
                amountSpent += e.getAmount();
            }
            amountOwed += e.getExpenseForUser(u);
            System.out.println("Amount owned " + amountOwed);
        }
        amountOwed += getTotalOwedAmountInAllGroups(u);
        return amountOwed - amountSpent;
    }

    private double getTotalOwedAmountInAllGroups(User u) {
        List<Group> grp = u.getGroups();
        if (grp == null) {
            return 0.0;
        }
        int amountSpent = 0;
        int amountOwed = 0;
        ListIterator<Group> it = grp.listIterator();
        while (it.hasNext()) {
            Group g = it.next();
            double[] arr = getSpentAndOwedAmount(u, g);
            amountSpent+= arr[0];
            amountOwed+= arr[1];
        }
        return (amountOwed - amountSpent);
    }

    private double[] getSpentAndOwedAmount (User u, Group g) {
        List<Expense> expenses = g.getExpenses();

        ListIterator<Expense> it = expenses.listIterator();
        int amountSpent = 0;
        int amountOwed = 0;
        double[] retArr = new double[2];
        while (it.hasNext()) {
            Expense e = it.next();
            if (e.getPayer() == u) {
                amountSpent += e.getAmount();
            }
            amountOwed += e.getExpenseForUser(u);
        }
        retArr[0] = amountSpent;
        retArr[1] = amountOwed;
        return retArr;
    }

    public Expense creatExpense (int amount, List<User> users, SplitStrategy strategy, User payer, String description) {
        Expense e = new Expense(amount, users, strategy, payer, description);
        Iterator<User> it = users.listIterator();
        UserService userService = UserService.userService();
        while (it.hasNext()) {
            userService.addExpense (it.next(), e);
        }
        return e;
    }

    public double getTotalOwedAmount (User u, Group g) {
        double[] spentAndOwed = getSpentAndOwedAmount(u, g);
        return spentAndOwed[1] - spentAndOwed[0];
    }

    public List<Expense> getExpenseHistory (User u) {
        List<Expense> expenses = u.getExpenses(); 
        Collections.reverse (expenses);
        return expenses;
    }

    public List<Expense> getExpenseHistory (User u, Group g) {
        List<Expense> expenses = g.getExpenses();
        List<Expense> userExpenses = new ArrayList<>();

        Iterator<Expense> it = expenses.listIterator();
        
        while (it.hasNext()) {
            Expense e = it.next();
            if (e.getExpenseForUser(u) != 0) {
                userExpenses.add(e);
            }
        }
        Collections.reverse(userExpenses);
        return userExpenses;

    }
}