package decorator;

public class Main {
    public static void main (String[] args) {
        BasePizza base = new MargheritaPizza();
        Customization cheese = new CheeseCustomization(base);
        Customization thinCrust = new ThinCrustCustomization(cheese);
        thinCrust = new CheeseCustomization(thinCrust);
        System.out.println("Pizza " + thinCrust.name());
        System.out.println("Cost " + thinCrust.cost());
    }   
}
