package business;

import java.util.HashMap;
import java.util.Map;

public class Match {
    
    private Club host;
    private Club visitor;
    private Club winner;
    private boolean startingPoints;
    private Map<Player, Integer> hostGols;
    private Map<Player, Integer> visitorGols;

    public Match(Club host, Club visitor, Club winner, boolean startingPoints) {
        this.host = host;
        this.visitor = visitor;
        this.winner = winner;
        this.startingPoints = startingPoints;
        this.hostGols = new HashMap<Player, Integer>();
        this.visitorGols = new HashMap<Player, Integer>();
    }

    public Club getHost() {
        return host;
    }

    public Club getVisitor() {
        return visitor;
    }

    public Club getWinner() {
        return winner;
    }

    public boolean getStartingPoints() {
        return startingPoints;
    }

    public Map<Player, Integer> getHostGols() {
        return hostGols;
    }

    public Map<Player, Integer> getVisitorGols() {
        return visitorGols;
    }

    @Override
    public String toString() {
        return "Match [host=" + host + ", visitor=" + visitor + ", winner=" + winner + ", hostGols=" + hostGols
                + ", visitorGols=" + visitorGols + "]";
    }

} 
