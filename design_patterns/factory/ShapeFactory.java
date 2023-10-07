package factory;

public class ShapeFactory {
    public Shape getShapeObject (String shape) {
        switch (shape) {
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            default:
                return new Circle();
        }
    }
}
