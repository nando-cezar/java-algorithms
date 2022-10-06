package business;

public class Employee extends Person{
    
    public Employee(String nome, Boss boss) {
		super(nome, boss);
	}

	@Override
	public String addSupervised(Person person) throws Exception {
		throw new Exception();
	}
	
	@Override
	public void getListSupervised() {
		System.out.println("Empregados não têm supervisionados");
	}
}
