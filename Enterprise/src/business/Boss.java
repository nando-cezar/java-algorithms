package business;

public class Boss extends Person{
    
    public Boss(String name, Boss boss) {
		super(name, boss);
	}

	@Override
	public String addSupervised(Person person) throws Exception {
		this.getSupervised().add(person);
		return person.getName();
	}
}
