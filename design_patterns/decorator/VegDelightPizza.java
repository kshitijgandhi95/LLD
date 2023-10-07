package decorator;

public class VegDelightPizza implements BasePizza{
    String name;
    VegDelightPizza () {
        name = "Veg Delight";
    }
    @Override
    public int cost() {
        return 150;
    }

    @Override
    public String name() {
        return this.name;
    }
}
