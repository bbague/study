package day06_2.lib;

public class Rectangle extends AbstractShape implements Printable{
	double side1;
	double side2;
	
	public Rectangle(double side1, double side2) {
		super(0, 0);
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public double getArea() {
		return side1*side2;
	}
	
	public double getPerimeter() {
		return 2*(side1+side2);
	}

	@Override
	public void print() {
		System.out.print("면적은 : ");
		System.out.println(this.getArea());
		System.out.print("둘레는 : ");
		System.out.println(this.getPerimeter());
	}
	
}
