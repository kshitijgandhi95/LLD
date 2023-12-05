package cricinfo.Models;

import java.util.HashSet;
import java.util.Set;

public class TournamentSquad {
    private Team team;
    private Set<Player> players;
    private Tournament tournament;

    TournamentSquad (Team team, Tournament tournament) {
        this.team = team;
        this.players = new HashSet<>();
        this.tournament = tournament;
    }

    TournamentSquad (Team team, Tournament tournament, Set<Player> players) {
        this.team = team;
        this.players = players;
        this.tournament = tournament;
    }

    public void addPlayer (Player p) {
        if (this.players.contains(p)) {
            throw new Error("Player already in tournament squad");
        }
        this.players.add (p);
        return;
    }
    
}
