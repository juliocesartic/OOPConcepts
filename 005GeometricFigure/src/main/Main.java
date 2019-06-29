package main;
import domain.*;

public class Main {

	public static void main(String[] args) {
		
		Strategy c = new Strategy();
		GeometricFigure fg = c.createFigure(TypeFigure.SQUARE, 3, 3);
		double area = fg.area();
		double perimeter = fg.perimeter();
		System.out.println("Square Information:");
		System.out.println("Area:" + area);
		System.out.println("Perimeter:" + perimeter);
		fg.description();
		
		
		fg = c.createFigure(TypeFigure.RECTANGLE, 5, 3);
		area = fg.area();
		perimeter = fg.perimeter();
		System.out.println("Rectangle Information:");
		System.out.println("Area:" + area);
		System.out.println("Perimeter:" + perimeter);
		fg.description();
		
		fg = c.createFigure(TypeFigure.TRIANGLE, 4, 3);
		area = fg.area();
		perimeter = fg.perimeter();
		System.out.println("Triangle Information:");
		System.out.println("Area:" + area);
		System.out.println("Perimeter:" + perimeter);
		fg.description();
		
		
		

	}

}
