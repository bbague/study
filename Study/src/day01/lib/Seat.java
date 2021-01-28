package day01.lib;

public class Seat {
	private String name;
	
	
	
	public String getName() {
		return name;
	}

	public void reserve(String name) {
		this.name = name;
	}
	
	public void cancel() {
		name = null;
	}
	
	public boolean isOccupied() {
		return name != null;
	}
	
	public boolean match(String checkName) {
		return checkName.equals(getName());
	}
}
