package src.factorymethod;

public class CreadorpizadeSalami implements Creadorpizza{
    @Override
    public Pizza crear() {
        return new PizzaSalami();
    }
}
