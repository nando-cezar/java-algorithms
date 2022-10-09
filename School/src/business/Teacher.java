package business;

public class Teacher extends Researcher{
    
    protected Teacher(String name, Coordinator coordinator) {
        super(name, coordinator);
    }

    @Override
    public String addSupervised(Researcher researcher) throws Exception{
        throw new Exception();
    }

    @Override
    public double getRegistrationFee() {
        return 220 + (0.3 * this.getCoordinator().getRegistrationFee());
    }
}
