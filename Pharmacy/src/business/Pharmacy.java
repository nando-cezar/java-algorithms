package business;

import java.util.ArrayList;
import java.util.List;

public class Pharmacy {
    
    private List<Medicines> medication;

    public Pharmacy() {
        this.medication = new ArrayList<Medicines>();
    }

    public List<Medicines> getMedication() {
        return medication;
    }

}
