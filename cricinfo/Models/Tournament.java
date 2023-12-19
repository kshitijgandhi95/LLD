package cricinfo.Models;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import cricinfo.Enums.FormatType;
import cricinfo.Enums.StatusType;
import cricinfo.Enums.TournamentType;

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
    private TournamentType tournamentType;
    private FormatType formatType;

    //contructor

    public Tournament (List<Team> teams, long startTime, FormatType formatType) {
        this.tournamentId = UUID.randomUUID();
        this.teams = teams;
        this.startTime = startTime;
        this.formatType = formatType;
    }

    public FormatType getFormatType () {
        return this.formatType;
    }

    public void setEndTime (long endTime) {
        this.endTime = endTime;
    }

    public void addTournamentSquad (Team t, TournamentSquad squad) {
        this.squads.put(t, squad);
    }

    public TournamentSquad getTournamentSquad (Team t) {
        return this.squads.getOrDefault(t, null);
    }

    public void setTournamentType (TournamentType type) {
        this.tournamentType = tournamentType;
    }

    public void setMatches (List<Match> matches) {
        this.matches = matches;
    }
    //getters and setters

    //observer for winner when status changes to finished

}
