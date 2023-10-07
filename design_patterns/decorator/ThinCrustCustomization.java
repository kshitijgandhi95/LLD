package decorator;

public class ThinCrustCustomization implements Customization{

    String name;
    BasePizza base;

    ThinCrustCustomization (BasePizza base) {
        this.base = base;
        this.name = "thin crust";
    }

    @Override
    public int cost() {
        return 50 + base.cost();
    }

    @Override
    public String name() {
        return base.name() + " " + this.name;
    }
    
}
