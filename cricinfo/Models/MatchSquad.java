package cricinfo.Models;

import java.util.HashSet;
import java.util.Set;

public class MatchSquad {
    private TournamentSquad tournamentSquad;
    private Set<Player> players;
    private Match match;

    MatchSquad (TournamentSquad tournamentSquad, Match match) {
        this.tournamentSquad = tournamentSquad;
        this.match = match;
        this.players = new HashSet<>();
    }

    MatchSquad (TournamentSquad tournamentSquad, Match match, Set<Player> players) {
        this.tournamentSquad = tournamentSquad;
        this.match = match;
        this.players = players;
    }

    //add players

    //getters and setters
}
