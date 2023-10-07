package abstractFactory;

public class ShapeFactoryAbstract {
    public Shape getShapeObject (String shape, String type) {
        switch (type) {
            case "Good":
                GoodShapeFactory gSF = new GoodShapeFactory();
                return gSF.getShapeObject(shape);
            case "Bad":
                BadSahpeFactory bSF = new BadSahpeFactory();
                return bSF.getShapeObject(shape);
            default:
                gSF = new GoodShapeFactory();
                return gSF.getShapeObject(shape);
        }
    }
}
