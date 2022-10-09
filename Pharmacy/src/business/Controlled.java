package business;

public class Controlled extends Medicines{

    private int initialQuantity;

    public Controlled(int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
        this.initialQuantity = quantity;
    }

    private double getQuantityPercentage() {
        return initialQuantity * 0.2;
    }

    @Override
    public void purchase() throws Exception{
        if(this.getQuantity() > getQuantityPercentage()){
            this.setQuantity(this.getQuantity() - 1);
        }else{
            throw new Exception("Medicamento abaixo de 20% em estoque");
        }
    }

    public void giveBack(int quantity) {
        this.setQuantity(this.getQuantity() + quantity);
    }
}
