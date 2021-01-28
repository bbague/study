package day06.lib;

public class Cat extends AbstractAnimal{
	
	public Cat(String name) {
		super(name);
	}

	@Override
	public void cry() {
		System.out.println("³ª¿ËÀÌ´Ù¿Ë");
	}
	
	
}
