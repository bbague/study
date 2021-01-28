package day06_2.lib;

public class AbstractShape {
	protected double x;
	protected double y;
	
	public AbstractShape(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setXY(double x, double y) {
		this.y = y;
	}
	
	public void move(double xDistance, double yDistance) {
		x += xDistance;
		y += yDistance;
	}
	
}
