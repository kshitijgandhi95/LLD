package cricinfo.Models.Rules;

import java.util.List;

import cricinfo.Models.Rules.Strategy.BattingRules;
import cricinfo.Models.Rules.Strategy.BowlingRules;
import cricinfo.Models.Rules.Strategy.PowerPlayRules;

public class OneDayRules implements Rule{
    private BattingRules battingRules;
    private BowlingRules bowlingRules;
    private PowerPlayRules powerPlayRules;

    public OneDayRules (BattingRules battingRules, BowlingRules bowlingRules, PowerPlayRules powerPlayRules) {
        this.battingRules = battingRules;
        this.bowlingRules = bowlingRules;
        this.powerPlayRules = powerPlayRules;
    }
    @Override
    public List<String> getBattingRules() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBattingRules'");
    }

    @Override
    public List<String> getBowlingRules() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBowlingRules'");
    }

    @Override
    public List<String> getFieldingRules() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFieldingRules'");
    }

    @Override
    public List<String> getPowerPlayRules() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPowerPlayRules'");
    }
    
}
