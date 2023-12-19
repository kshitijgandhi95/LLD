package cricinfo.Services;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import cricinfo.Enums.CountryType;
import cricinfo.Enums.TeamType;
import cricinfo.Models.Team;

public class TeamController {
    private Set<Team> teams;
    private Map<CountryType, Team> countryToTeam;

    public TeamController () {
        teams = new HashSet<>();
        countryToTeam = new HashMap<>();
        createTeam();
        
        new PlayerController(teams);
        
        
        
    }

    //creational
    private void createTeam() {
        Team india = new Team("India", TeamType.NATIONAL, CountryType.INDIA);
        teams.add (india);
        countryToTeam.put(CountryType.INDIA, india);

        Team australia = new Team("Australia", TeamType.NATIONAL, CountryType.AUSTRALIA);
        teams.add (australia);
        countryToTeam.put(CountryType.AUSTRALIA, australia);
        Team pakistan = new Team("Pakistan", TeamType.NATIONAL, CountryType.PAKISTAN);
        teams.add (pakistan);
        countryToTeam.put(CountryType.PAKISTAN, pakistan);
        Team bangladesh = new Team("Bangladesh", TeamType.NATIONAL, CountryType.BANGLADESH);
        teams.add (bangladesh);
        countryToTeam.put(CountryType.BANGLADESH, bangladesh);
    }
}
