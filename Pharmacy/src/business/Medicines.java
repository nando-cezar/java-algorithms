package business;

public abstract class Medicines {
    
    private int id;
    private String name;
    private double price;
    private int quantity;
    
    protected Medicines(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract void purchase() throws Exception;

    public abstract void giveBack(int quantity) throws Exception;

    @Override
    public String toString() {
        return "Medicines [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
    }

}
