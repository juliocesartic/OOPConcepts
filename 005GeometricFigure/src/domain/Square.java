package domain;

public class Square extends GeometricFigure {
	
	public Square(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public void description() {
		System.out.println("I am a Square.");
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
