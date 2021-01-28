package day06.lib;

public class Dog extends AbstractAnimal{
	
	public Dog(String name) {
		super(name);
	}

	@Override
	public void cry() {
		System.out.println("¸Û¸ÛÀÌ¿Ã¾¾´Ù");
	}
	
	
}
