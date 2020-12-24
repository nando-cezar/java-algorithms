package battery;

import BASE.StructureStatic;

public class Battery<T> extends StructureStatic<T>{
    
    public Battery() {
        super();
    }

    public Battery(int capacity) {
        super(capacity);
    }

    public void  stackUp (T element) {
		super.add(element);
	}
	
	public T top () {
		
		if (this.isEmpyt()) {
			return  null;
		} 
		
		return this.elements [size - 1 ];
	}
	
	public T stackDown() {
		
		if (this.isEmpyt()) {
			return  null ;
		}
		
		return this.elements [- size];
	}
}
