package business;

public class Salary {

    private SalaryDescription description;
    private double value;

    public Salary(SalaryDescription description, double value) {
        this.description = description;
        this.value = value;
    }

    public SalaryDescription getDescription() {
        return description;
    }

    public void setDescription(SalaryDescription description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
