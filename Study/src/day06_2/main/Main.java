package day06_2.main;

import java.util.ArrayList;

import day06_2.lib.Printable;
import day06_2.lib.Rectangle;
import day06_2.lib.Square;

public class Main {

	public static void main(String[] args) {
		ArrayList<Printable> shapes = new ArrayList<>();
		
		shapes.add(new Rectangle(3,4));
		shapes.add(new Rectangle(4,2));
		shapes.add(new Square(3));
		shapes.add(new Square(1));
		
		for(Printable shape : shapes) {
			shape.print();
			System.out.println("-----------");
		}
		
	}

}
