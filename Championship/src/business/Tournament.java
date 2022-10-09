package business;

import java.util.ArrayList;
import java.util.List;

public class Tournament {
    
    private String name; 
    private Club champion;
    private Player gunner;
    private Player goalkeeper;
    private List<Club> clubs;
    private List<Round> rounds;
    
    private static final int TOTAL_ROUND = 46;
    private static final int TOTAL_CLUB = 24;

    public Tournament(String name) {
        this.name = name;
        this.clubs = new ArrayList<Club>();
        this.rounds = new ArrayList<Round>();
    }

    public String getName() {
        return name;
    }

    public Club getChampion() {
        return champion;
    }

    public void setChampion(Club champion) {
        this.champion = champion;
    }

    public Player getGunner() {
        return gunner;
    }

    public void setGunner(Player gunner) {
        this.gunner = gunner;
    }

    public Player getGoalkeeper() {
        return goalkeeper;
    }

    public void setGoalkeeper(Player goalkeeper) {
        this.goalkeeper = goalkeeper;
    }

    public List<Club> getClubs() {
        return clubs;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public static int getTotalRound() {
        return TOTAL_ROUND;
    }

    public static int getTotalClub() {
        return TOTAL_CLUB;
    }

    @Override
    public String toString() {
        return "Tournament [name=" + name + ", champion=" + champion + ", gunner=" + gunner + ", goalkeeper="
                + goalkeeper + "]";
    }
     
}
