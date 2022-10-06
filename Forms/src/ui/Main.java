package ui;

import business.Circle;
import business.GeometricForm;
import business.Square;

public class Main {
    public static void main(String[] args) {
		
		GeometricForm forma=new Circle();
		System.out.println(forma.getNome());
		
		forma=new Square();
		System.out.println(forma.getNome());
		
	}
}
