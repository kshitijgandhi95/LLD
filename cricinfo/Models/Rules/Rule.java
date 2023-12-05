package cricinfo.Models.Rules;

import java.util.List;

public interface Rule {
    public List<String> getBattingRules();
    public List<String> getBowlingRules();
    public List<String> getFieldingRules();
    public List<String> getPowerPlayRules();
}
