package cricinfo.Services.Factory;

import java.util.List;

import cricinfo.Enums.FormatType;
import cricinfo.Enums.TournamentType;
import cricinfo.Models.Match;
import cricinfo.Models.Team;
import cricinfo.Models.Tournament;
import cricinfo.Services.FixtureCreator;

public class TournamentFactory {
    FixtureCreator fixtureCreator;
    
    TournamentFactory () {
        this.fixtureCreator = new FixtureCreator();
    }

    public Tournament createTournament (List<Team> teams, TournamentType tournamentType, FormatType formatType, long startDate) {
        Tournament t = new Tournament(teams, startDate, formatType);
        
        List<Match> matches = getMatches (t, teams, tournamentType, formatType);
        
        long endTime = getTournamentEndTime(matches);
        
        t.setTournamentType(tournamentType);
        t.setMatches (matches);
        t.setEndTime(endTime);
        
        return t;

    }

    private List<Match> getMatches (Tournament t, List<Team> teams, TournamentType tournamentType, FormatType formatType) {
        return fixtureCreator.createFixture(t, teams, tournamentType, formatType);
    }

    private long getTournamentEndTime (List<Match> matches) {
        return matches.get(matches.size()-1).getEndTime();
    }
}
