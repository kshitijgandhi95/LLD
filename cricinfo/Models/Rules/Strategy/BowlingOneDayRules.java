package cricinfo.Models.Rules.Strategy;

import java.util.List;
import java.util.Set;

public class BowlingOneDayRules implements BowlingRules{
    Set<String> rules;

    public BowlingOneDayRules (Set<String> rules) {
        this.rules = rules;
    }

    @Override
    public Set<String> getRules() {
        return this.rules;
    }

    //add rules

    //remove rules
}
