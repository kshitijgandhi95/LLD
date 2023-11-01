package splitwise.models;

import java.util.HashMap;
import java.util.List;

public class Expense {
    private SplitStrategy strategy;
    private int amount;
    private List<User> users;
    private HashMap<User, Double> owedAmount;
    private User payer;
    private String description;

    public Expense (int amount, List<User> users, SplitStrategy strategy, User payer, String description) {
        this.strategy = strategy;
        this.amount = amount;
        this.users = users;
        this.strategy = strategy;
        this.description = description;
        this.owedAmount = this.strategy.split(this);
        this.payer = payer;
    }

    public int getAmount() {
        return this.amount;
    }

    public List<User> getUsers() {
        return this.users;
    }

    public User getPayer () {
        return this.payer;
    }

    public Double getExpenseForUser (User u) {
        if (owedAmount.containsKey(u)) {
            return owedAmount.get(u);
        }
        return 0.0;
    }

    //getters and setters
}
