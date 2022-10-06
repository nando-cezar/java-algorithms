package business;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
    
    private String name;
	private Boss boss;
	private List<Person> supervised;
	
	protected Person(String name, Boss boss) {
		super();
		this.name = name;
		this.boss = boss;
		this.supervised=new ArrayList<Person>();
		try {
			this.boss.addSupervised(this);
		} catch (Exception e) {
			System.out.println("Essa pessoa não tem boss!");
		}
	}
	
	public abstract String addSupervised(Person person) throws Exception;
	
	public void getListSupervised() {
		for(int i = 0; i < this.getSupervised().size(); i++) {
			String name = this.getSupervised().get(i).getName();
			System.out.println(name);
			this.getSupervised().get(i).getListSupervised();
		}
	}
	
	public void getSuperiors() {
		Person temp = this.getBoss();
		while(temp != null) {
			System.out.println(temp.getName());
			temp = temp.getBoss();
		}
	}
	
	public Person getPerson(String name) throws Exception{
		for (Person pessoa : supervised) {
			if(pessoa.getName().equalsIgnoreCase(name)) {
				return pessoa;
			}else {
				pessoa.getPerson(name);
			}
		}
		throw new Exception();
	}

	public String getName() {
		return name;
	}


	public Boss getBoss() {
		return boss;
	}

	public List<Person> getSupervised() {
		return supervised;
	}
}
