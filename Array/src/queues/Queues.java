package queues;

import BASE.StructureStatic;

public class Queues<T> extends StructureStatic<T> {

    public Queues(){
        super();
    }

    public Queues(int param){
        super(param);
    }
    
    public void addInQueues(T element){
        this.add(element);
    }

    public T spy(){

        if(this.isEmpty()){
            return null;
        }
        return this.elements[0];
    }
}
