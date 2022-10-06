package ui;

import business.Person;
import business.Son;

public class Main {
    
    public static void main(String[] args) {
        
		Person person = new Son("João",null);
		try {
			person.registerDescendants("Manoel", "M");
		}catch (Exception e) {
			System.out.println("Natimorto não gera Filho!");
		}

	}
}
