package ui;

import business.Candidate;
import business.Voting;

public class Main {
    public static void main(String[] args){

        Voting vote = new Voting();

        vote.getCandidates().add(new Candidate(1, "Juliana"));
        vote.getCandidates().add(new Candidate(2, "Dhomini"));

        vote.addVote("Juliana");
        vote.addVote("Dhomini");
        vote.addVote("Dhomini");

        System.out.println(vote.winner());
    }
}
