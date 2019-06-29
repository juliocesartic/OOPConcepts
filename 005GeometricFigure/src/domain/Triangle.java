package domain;

public class Triangle extends GeometricFigure {
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double area() {
		return (double) (this.base * this.height) / 2;
	}

	@Override
	public double perimeter() {
		// we suppose a equilateral triangle
		return (double) (3 * this.base);
	}

}
