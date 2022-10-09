package business;

import java.util.ArrayList;
import java.util.List;

public abstract class Researcher {
    
    private String name;
    private Coordinator coordinator;
    private List<Researcher> supervised;

    protected Researcher(String name, Coordinator coordinator){
        this.name = name;
        this.coordinator = coordinator;
        this.supervised = new ArrayList<Researcher>(); 
    }

    public int getSizeSupervised(){
        return supervised.size();
    }

    public abstract String addSupervised(Researcher researcher) throws Exception;

    public abstract double getRegistrationFee();

    public String getName() {
        return name;
    }

    public Coordinator getCoordinator() {
        return coordinator;
    }

    public List<Researcher> getSupervised() {
        return supervised;
    }
    
}   
