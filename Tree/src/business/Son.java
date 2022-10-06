package business;

public class Son extends Person{

	public Son(String name, Person father) {
		super("Sr. " + name, father);
	}

	@Override
	public void registerDescendants(String name, String sexo)throws Exception {
		int qtdPessoas=this.getDescendants().size();
		
		if(qtdPessoas==1) {
			this.getDescendants().add(new Stillborn(name, this));
		}else {
			if(sexo.equalsIgnoreCase("M")) {
				this.getDescendants().add(new Son(name, this));
			}else {
				this.getDescendants().add(new Daughter(name, this));
			}
		}	
	}
}

