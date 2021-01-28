package day02.lib;

public class Course {
	
	public static final int CREDIT_MAJOR = 3;
	public static final int CREDIT_GENERAL = 2;
	public String name;
	public double grade;
	public int credit;
	
	public Course(String name, int credit, String grade) {
		this.name=name;
		this.credit=credit;
		
		if(grade.equals("A+")) {
			this.grade=4.5;
		}else if(grade.equals("A")){
			this.grade=4.0;
		}else if(grade.equals("B+")){
			this.grade=3.5;
		}else if(grade.equals("B")){
			this.grade=3.0;
		}else if(grade.equals("C+")){
			this.grade=2.5;
		}else if(grade.equals("C")){
			this.grade=2.0;
		}else if(grade.equals("D+")){
			this.grade=1.5;
		}else if(grade.equals("D")){
			this.grade=1.0;
		}else {
			this.grade=0;
		}
	}
	
}
