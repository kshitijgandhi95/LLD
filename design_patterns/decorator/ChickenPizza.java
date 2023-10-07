package decorator;

public class ChickenPizza implements BasePizza{
    String name;
    ChickenPizza () {
        this.name = "Chicken Pizza";
    }
    @Override
    public int cost() {
        return 175;
    }

    @Override
    public String name() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'name'");
    }
    
}
