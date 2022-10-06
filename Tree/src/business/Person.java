package business;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
	
	private String name;
	private Person father;
	private List<Person> descendants;
	
	protected Person(String name, Person father) {
		this.descendants= new ArrayList<Person>();
		this.name=name;
		this.father=father;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getFather() {
		return father;
	}

	public List<Person> getDescendants() {
		return descendants;
	}

	public void listAscending() {
		Person current = this;
		
		while(current != null) {
			System.out.println(current.getName());
			current = current.getFather();
		}
	}
	
	public abstract void registerDescendants(String name, String gender)throws Exception;
	

}

