package business;

import java.util.ArrayList;
import java.util.List;

public class Voting {
    
    private List<Candidate> candidates;

    public Voting(){
        this.candidates = new ArrayList<Candidate>();
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void addVote(String candidate){
        for(int i = 0; i < candidates.size(); i++){
            if(candidates.get(i).getName().equals(candidate)){
                candidates.get(i).setQuantity(candidates.get(i).getQuantity() + 1);
            }
        }
    }
        

    public void addVote(int idCandidate){
        for(int i = 0; i < candidates.size(); i++){
            if(candidates.get(i).getId() == idCandidate){
                candidates.get(i).setQuantity(candidates.get(i).getQuantity() + 1);
            }
        }
    }

    public Candidate winner(){

        Candidate previousCandidate = this.getCandidates().get(0);
        Candidate currentCandidate = this.getCandidates().get(1);

        if(previousCandidate.getQuantity() > currentCandidate.getQuantity()){
            return previousCandidate;
        }else{
            return currentCandidate;
        }

    }

}
