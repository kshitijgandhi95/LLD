package cricinfo.Models.Scorecard;

import cricinfo.Enums.MatchBatsmanStatus;
import cricinfo.Models.Player;

public class BattingInfo {
    private Player player;
    private int runs;
    private int balls;
    private int fours;
    private int six;
    private MatchBatsmanStatus status;
    private String statusRemark;

    //constructor

    //observer pattern for stats
    public void updateRuns (int runs, int fours, int sixes) {

    }
}
