package src.factorymethod;

public class Pizzahawaiana implements Pizza{

    @Override
    public String getTipoMasa() {
        return "Delgada";
    }

    @Override
    public String getTipoQueso() {
        return "Mozzarella";
    }

    @Override
    public String getTipoToppings() {
        return "Jamon y Piña";
    }

    public String toString (){
        return getTipoMasa() + getTipoQueso() + getTipoToppings();
    }
}
