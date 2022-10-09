package business;

import java.util.ArrayList;
import java.util.List;

public class Club {
    
    private String name;
    private int points;
    private int gamesWon;
    private int goalsBalance;
    private int goalsScored;
    private int goalsConceded;
    private List<Player> players;
    private static final int TOTAL_PLAYERS = 23;

    public Club(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public int getGoalsBalance() {
        return goalsBalance;
    }

    public void setGoalsBalance(int goalsBalance) {
        this.goalsBalance = goalsBalance;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public static int getTotalPlayers() {
        return TOTAL_PLAYERS;
    }

    @Override
    public String toString() {
        return "Club [name=" + name + "]";
    }

}
