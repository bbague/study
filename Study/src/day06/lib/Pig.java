package day06.lib;

public class Pig extends AbstractAnimal{
	public Pig(String name) {
		super(name);
	}

	@Override
	public void cry() {
	System.out.println("쏘 테이스티");
	}
	
}
