package cricinfo.Models;

import java.util.UUID;

import LowLevelDesign.LLDCricbuzz.Team.Player.PlayerType;

public class Player {
    private UUID playerId;
    private Team team;
    private String name;
    private long dob;
    private PlayerType playerType;

    Player (Team team, String name, long dob, PlayerType playerType) {
        this.playerId = UUID.randomUUID();
        this.name = name;
        this.dob = dob;
        this.playerType = playerType;
    }

    //getters and setters
}
