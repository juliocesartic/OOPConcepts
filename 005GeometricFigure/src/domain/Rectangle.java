package domain;

public class Rectangle extends GeometricFigure {
	
	public Rectangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void description() {
		System.out.println("I am a Rectangle");
	}

	@Override
	public double area() {
		return (double) this.base * this.height;
	}

	@Override
	public double perimeter() {
		return (double) (2 * this.base) + (2 * this.height);
	}


}
