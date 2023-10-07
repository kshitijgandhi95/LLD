package decorator;

public class CheeseCustomization implements Customization{
    String name;
    BasePizza base;

    CheeseCustomization (BasePizza base) {
        this.base = base;
        this.name = "Cheese";
    }

    @Override
    public int cost() {
        return 30 + base.cost();
    }

    @Override
    public String name() {
        return base.name() + " " + this.name;
    }
}
