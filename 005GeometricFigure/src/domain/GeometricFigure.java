package domain;

public abstract class GeometricFigure {
	protected double base;
	protected double height;
	
	public abstract double area();
	public abstract double perimeter();
	
	public void description() {
		System.out.println("I am a Generic Geometic Value");
	}
}
