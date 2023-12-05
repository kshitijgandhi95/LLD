package cricinfo.Models.Rules.Strategy;

import java.util.Set;

public class BattingRules implements BattingRulesInterface{
    Set<String> rules;

    BattingRules (Set<String> rules) {
        this.rules = rules;
    }

    @Override
    public Set<String> getRules() {
        return this.rules;
    }

    //add rules

    //remove rules
}
