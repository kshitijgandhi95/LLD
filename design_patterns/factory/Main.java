package factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory sF = new ShapeFactory();
        Shape circle = sF.getShapeObject("Square");
        circle.draw();
    }
}
