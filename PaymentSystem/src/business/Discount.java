package business;

public class Discount {

    private DiscountDescription description;

    public Discount(DiscountDescription description) {
        this.description = description;
    }

    public DiscountDescription getDescription() {
        return description;
    }

    public void setDescription(DiscountDescription description) {
        this.description = description;
    }

}
