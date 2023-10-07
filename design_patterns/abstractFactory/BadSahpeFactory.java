package abstractFactory;

public class BadSahpeFactory implements shapeFactoryInterface{

    @Override
    public Shape getShapeObject(String s) {
        switch (s) {
            case "Circle":
                return new Circle();
            default:
                return new Circle();
        }
    }
    
}
