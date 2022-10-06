package business;

import java.util.Random;

public class Daughter extends Person{

	public Daughter(String name, Person father) {
		super("Sra. "+name, father);
	}

	@Override
	public void registerDescendants(String name, String gender)throws Exception {

		if(gender.equalsIgnoreCase("M")) {

			Random r = new Random();
			int chance = r.nextInt(2);
			if(chance == 1) {
				this.getDescendants().add(new Stillborn(name,this));
			}else {
				this.getDescendants().add(new Son(name,this));
			}
			
		}else {
			this.getDescendants().add(new Daughter(name,this));
		}
		
	}
	

}

