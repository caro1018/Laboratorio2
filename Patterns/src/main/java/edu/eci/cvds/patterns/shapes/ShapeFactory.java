package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;

public interface ShapeFactory {

	public static Shape create(RegularShapeType shapeType){
		Shape currentShape = null;
		switch (shapeType){
			case Triangle:
				currentShape = new Triangle();
				break;
			case Quadrilateral:
				currentShape = new Quadrilateral();
				break;
			case Pentagon:
				currentShape = new Pentagon();
				break;
			case Hexagon:
				currentShape = new Hexagon();
				break;
		}
		return currentShape;
	}
}