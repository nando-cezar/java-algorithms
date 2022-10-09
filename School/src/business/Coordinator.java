package business;

public class Coordinator extends Researcher{

    protected Coordinator(String name, Coordinator coordinator) {
        super(name, coordinator);
    }

    @Override
    public String addSupervised(Researcher researcher) throws Exception{
        this.getSupervised().add(researcher);
        return researcher.getName();
    }

    @Override
    public double getRegistrationFee() {
        return 300 - (300 * (0.025 * this.getSizeSupervised()));
    }

}
