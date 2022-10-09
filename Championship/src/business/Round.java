package business;

import java.util.ArrayList;
import java.util.List;

public class Round {
    
    private int id;
    private List<Match> matches;

    public Round(int id) {
        this.id = id;
        this.matches = new ArrayList<Match>();
    }

    public int getId() {
        return id;
    }

    public List<Match> getMatches() {
        return matches;
    }
    
}
