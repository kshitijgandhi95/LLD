package cricinfo.Models;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import cricinfo.Enums.StatusType;

public class Tournament {
    private UUID tournamentId;
    private List<Team> teams;
    private Map<Team, TournamentSquad> squads;
    private Team winner;
    private List<Match> matches;
    private Map<Team, Match> teamMatches;
    private StatusType status;
    private long startTime;
    private long endTime;

    //contructor

    //getters and setters

    //observer for winner when status changes to finished

}
