package domain;

public class Strategy {
	
	public GeometricFigure createFigure(TypeFigure typeFigure, double base, double height) {
		GeometricFigure  fg = null;
		if(typeFigure == TypeFigure.RECTANGLE) {
			fg = new Rectangle(base, height);
		}
		else if(typeFigure == TypeFigure.SQUARE) {
			fg = new Square(base, height);
		}
		else if(typeFigure == TypeFigure.TRIANGLE) {
			fg = new Triangle(base, height);
		}
		
		return fg;
	}

}
