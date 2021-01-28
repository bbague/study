package day06.main;

import java.util.ArrayList;

import day06.lib.AbstractAnimal;
import day06.lib.Cat;
import day06.lib.Dog;
import day06.lib.Pig;

public class animals {

	public static void main(String[] args) {
		ArrayList<AbstractAnimal> animals = new ArrayList<>();
		
		animals.add(new Cat("�ƽ�"));
		animals.add(new Dog("�ɹ�"));
		animals.add(new Pig("ǰ��"));
		
		for(AbstractAnimal animal : animals) {
			System.out.print(animal.name + "�� �����Ҹ� : ");
			animal.cry();
		}
	}

}
