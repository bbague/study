package day06.main;

import java.util.ArrayList;

import day06.lib.AbstractAnimal;
import day06.lib.Cat;
import day06.lib.Dog;
import day06.lib.Pig;

public class animals {

	public static void main(String[] args) {
		ArrayList<AbstractAnimal> animals = new ArrayList<>();
		
		animals.add(new Cat("맥스"));
		animals.add(new Dog("심바"));
		animals.add(new Pig("품바"));
		
		for(AbstractAnimal animal : animals) {
			System.out.print(animal.name + "의 울음소리 : ");
			animal.cry();
		}
	}

}
