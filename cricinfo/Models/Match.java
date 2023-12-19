package cricinfo.Models;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import cricinfo.Enums.FormatType;
import cricinfo.Enums.StatusType;
import cricinfo.Models.Rules.Rule;
import cricinfo.Models.Scorecard.Scorecard;

public class Match {
    private UUID matchId;
    private Team[] teams;
    private Map<Team, MatchSquad> matchSquads;
    private Rule rule;
    private Scorecard scorecard;
    private StatusType status;
    private Team winner;
    private Tournament tournament;
    private Commentary commentary;
    private long startTime;
    private long endTime;
    private FormatType format;
    private Team toss;

    public Match (Team[] teams, FormatType formatType, Rule rule, Tournament t, long startTime, long endTime) {
        this.teams = teams;
        this.format = formatType;
        this.rule = rule;
        this.scorecard = new Scorecard();
        this.tournament = t;
        this.commentary = new Commentary();
        this.startTime = startTime;
        this.endTime = endTime;
        this.matchSquads = new HashMap<>();
    }

    public long getEndTime() {
        return this.endTime;
    }


}
