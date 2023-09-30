package src.factorymethod;

public class Creadorpizahawaiana implements Creadorpizza{
    @Override
    public Pizza crear() {
        return new Pizzahawaiana();
    }
}
