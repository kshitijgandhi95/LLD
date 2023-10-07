package decorator;

public class MargheritaPizza implements BasePizza{
    String name;
    MargheritaPizza () {
        name = "Margherita";
    }
    @Override
    public int cost() {
        return 120;
    }

    @Override
    public String name() {
        return this.name;
    }
    
}
