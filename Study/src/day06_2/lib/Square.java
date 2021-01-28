package day06_2.lib;

public class Square extends AbstractShape implements Printable{
	double side;
	
	public Square(double side) {
		super(0, 0);
		this.side = side;
	}
	
	public double getArea() {
		return side*side;
	}
	
	public double getPerimeter() {
		return 4*side;
	}

	@Override
	public void print() {
		System.out.print("������ : ");
		System.out.println(this.getArea());
		System.out.print("�ѷ��� : ");
		System.out.println(this.getPerimeter());
	}
	
}
