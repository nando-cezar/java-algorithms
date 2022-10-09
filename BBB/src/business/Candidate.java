package business;

public class Candidate {
    
    private int id;
    private String name;
    private int quantity;

    public Candidate(int id, String name) {
        this.id = id;
        this.name = name;
        this.quantity = 0;
    }

    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Candidate [id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
    }

}
