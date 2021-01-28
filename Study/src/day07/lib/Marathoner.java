package day07.lib;

public class Marathoner {
	private String name;
	private String completion;
	private int number;
	
	public void last(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public Marathoner(int number, String name) {
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getCompletion() {
		return completion;
	}
	public void setCompletion(String completion) {
		this.completion = completion;
	}

	
}
