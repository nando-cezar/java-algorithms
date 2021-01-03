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

    public T removeInQueues(){

        if(this.isEmpty()){
            return null;
        }

        T elementRemoved = this.elements[0];

        this.remove(0);

        return elementRemoved;
    }
}
