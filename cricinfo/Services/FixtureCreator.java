package cricinfo.Services;

import java.util.ArrayList;
import java.util.List;

import cricinfo.Enums.FormatType;
import cricinfo.Enums.TournamentType;
import cricinfo.Models.Match;
import cricinfo.Models.Team;
import cricinfo.Models.Tournament;
import cricinfo.Services.Factory.MatchFactory;

//creates fixtures
public class FixtureCreator {
    MatchFactory matchFactory;

    public FixtureCreator() {
        matchFactory = new MatchFactory();
    }

    public List<Match> createFixture (Tournament t, List<Team> teams, TournamentType tournamentType, FormatType formatType) {
        //find list of matches between teams
        List<Team[]> matchSchedule = getMatching(teams, tournamentType);
        List<Match> matches = new ArrayList<>();
        
        for (Team[] team: matchSchedule) {
            matches.add (matchFactory.createMatch(team, t.getFormatType(), t, 0, 0));
        }
        return matches;
        //create matches using match factory
    }

    public List<Team[]> getMatching (List<Team> teams, TournamentType tournamentType) {
        List<Integer[]> matchList;
        
        if (tournamentType == TournamentType.LEAGUE) {
            matchList = getMatchingForLeague(teams.size());

        }
        else if (tournamentType == TournamentType.KNOKOUT) {
            //should be different function call
            matchList = getMatchingForLeague(teams.size());
        }
        else {
            //should be different function call
            matchList = getMatchingForLeague(teams.size());
        }

        List<Team[]> retList = new ArrayList<>();

        for (Integer[] arr: matchList) {
            retList.add (new Team[]{teams.get(arr[0]), (teams.get(arr[1]))});
        }
        return retList;
    }

    public List<Integer[]> getMatchingForLeague (int numTeams) {
        List<Integer[]> retList = new ArrayList<>();
        for (int i=0; i<numTeams-1; i++) {
            for (int j=i+1; j<numTeams; j++) {
                retList.add ( new Integer[]{i, j});
            }
        }
        return retList;
    }
}
