package abstractFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactoryAbstract sF = new ShapeFactoryAbstract();
        Shape circle = sF.getShapeObject("Square", "Bad");
        circle.draw();
    }
}
