package cricinfo.Models.Stats;

import java.util.List;

import cricinfo.Models.Player;

public interface Stats {
    public List<Player> mostWickets();
    public List<Player> mostRuns();
    public List<Player> mostCenturies();
    public List<Player> mostStrikeRate();
    public List<Player> mostEconomyRate();
}
