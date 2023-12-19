package cricinfo.Services.Factory;

import java.util.HashSet;
import java.util.Set;

import cricinfo.Enums.FormatType;
import cricinfo.Enums.TournamentType;
import cricinfo.Models.Match;
import cricinfo.Models.Team;
import cricinfo.Models.Tournament;
import cricinfo.Models.Rules.OneDayRules;
import cricinfo.Models.Rules.Rule;
import cricinfo.Models.Rules.Strategy.BattingRules;
import cricinfo.Models.Rules.Strategy.BowlingOneDayRules;
import cricinfo.Models.Rules.Strategy.PowerPlayOneDayRules;

public class MatchFactory {
    public Match createMatch (Team[] teams, FormatType formanType, Tournament t, long startTime, long endTime) {
        Rule r = getRule(formanType);
        return new Match(teams, formanType, r, t, startTime, endTime);
    }

    private Rule getRule(FormatType formatType) {
        if (formatType == FormatType.ONEDAY) {
            return new OneDayRules(new BattingRules(new HashSet<>()), new BowlingOneDayRules(new HashSet<String>()), new PowerPlayOneDayRules());
        }
        return new OneDayRules(new BattingRules(new HashSet<>()), new BowlingOneDayRules(new HashSet<String>()), new PowerPlayOneDayRules());
    }
}
