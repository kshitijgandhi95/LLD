package abstractFactory;

public class GoodShapeFactory implements shapeFactoryInterface{

    @Override
    public Shape getShapeObject(String s) {
        switch (s) {
            case "Square":
                return new Square();
            default:
                return new Square();
        }
    }
    
}
