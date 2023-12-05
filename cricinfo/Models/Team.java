package cricinfo.Models;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import cricinfo.Enums.CountryType;
import cricinfo.Enums.TeamType;

public class Team {
    private UUID teamId;
    private Set<Player> players;
    private String name;
    private TeamType teamType;
    private CountryType countryType;

    Team (String name, TeamType teamType, CountryType countryType) {
        this.teamId = UUID.randomUUID();
        this.teamType = teamType;
        this.countryType = countryType;
        this.players = new HashSet<>();
    }

    public void addPlayer (Player p) {
        if (this.players.contains(p)) {
            throw new Error("Player already in team");
        }
        this.players.add (p);
        return;
    }

    //remove player

    //getters and setters
}
