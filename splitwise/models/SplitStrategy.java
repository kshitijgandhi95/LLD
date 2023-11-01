package splitwise.models;

import java.util.HashMap;

public interface SplitStrategy {
    public HashMap<User, Double> split(Expense e);
}