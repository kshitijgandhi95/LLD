package cricinfo.Models;

import java.util.UUID;

import cricinfo.Enums.FormatType;
import cricinfo.Enums.StatusType;
import cricinfo.Models.Rules.Rule;
import cricinfo.Models.Scorecard.Scorecard;

public class Match {
    private UUID matchId;
    private Team[] teams;
    private MatchSquad[] matchSquads;
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
}
