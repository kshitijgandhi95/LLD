package cricinfo.Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cricinfo.Enums.PlayerType;
import cricinfo.Models.Player;
import cricinfo.Models.Team;

public class PlayerController {
    private Set<Player> players;
    private Map<Team, List<Player>> teamToPlayers;

    PlayerController (Set<Team> teams) {
        players = new HashSet<>();
        teamToPlayers = new HashMap<>();
        
        for (Team t: teams) {
            createPlayers (t);
        }
    }

    private void createPlayers (Team t) {
        String name1 = "VIRAT-" + t.getCountryType();
        Player virat = new Player(t, name1, 0, PlayerType.BATSMAN);

        String name2 = "ROHIT-" + t.getCountryType();
        Player rohit = new Player(t, name2, 0, PlayerType.BATSMAN);

        String name3 = "BUMRAH-" + t.getCountryType();
        Player bumrah = new Player(t, name3, 0, PlayerType.BOWLER);
        
        String name4 = "SHAM-" + t.getCountryType();
        Player shami = new Player(t, name4, 0, PlayerType.BOWLER);

        t.addPlayer(virat);
        t.addPlayer(rohit);
        t.addPlayer(bumrah);
        t.addPlayer(shami);

        players.add (virat);
        players.add(rohit);
        players.add(bumrah);
        players.add(shami);

        List<Player> currPlayers = new ArrayList<>();
        currPlayers.add (virat);
        currPlayers.add(rohit);
        currPlayers.add(bumrah);
        currPlayers.add(shami);

        teamToPlayers.put(t, currPlayers);
    }
}
