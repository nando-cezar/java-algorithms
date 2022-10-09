package business;

public class Common extends Medicines{

    public Common(int id, String name, double price, int quantity) {
        super(id, name, price, quantity);
    }

    @Override
    public void purchase() throws Exception{
        if(this.getQuantity() > 0){
            if(this.getPrice() < 2.50f){
                this.setQuantity(this.getQuantity() - 2);
            }else{
                this.setQuantity(this.getQuantity() - 1);
            }
        }else{
            throw new Exception("Não tem em estoque!");
        }     
    }

    @Override
    public void giveBack(int quantity) throws Exception {
        throw new Exception("Não pode devolver!");
    }
    
}
