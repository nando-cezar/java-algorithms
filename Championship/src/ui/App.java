package ui;

import business.Club;
import business.Match;
import business.Player;
import business.Round;
import business.Tournament;

public class App {
    public static void main(String[] args) throws Exception {
        
        Tournament tournament = new Tournament("Campeonato brasileiro de 2003");

        tournament.getClubs().add(new Club("BAHIA"));
        tournament.getClubs().add(new Club("VITÓRIA"));

        tournament.getRounds().add(new Round(0));

        Match match = new Match(
            tournament.getClubs().get(0), 
            tournament.getClubs().get(1), 
            tournament.getClubs().get(0), 
            true
        );

        Player player1 = new Player("Luís Fernando");
        Player player2 = new Player("Neymar");
        Player player3 = new Player("Taffarel");

        match.getHostGols().put(player1, 3);
        match.getVisitorGols().put(player2, 1);
        
        tournament.getRounds().get(0).getMatches().add(match);

        // ----------------------------------------------------------------
        tournament.setChampion(tournament.getClubs().get(0));
        tournament.setGunner(player1);
        tournament.setGoalkeeper(player3);

        // ----------------------------------------------------------------

        System.out.println(tournament);
    }
}
