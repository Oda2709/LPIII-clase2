package src.factorymethod;

public class PizzaSalami implements Pizza{
    @Override
    public String getTipoMasa() {
        return "Gruesa";
    }

    @Override
    public String getTipoQueso() {
        return "Quesito";
    }

    @Override
    public String getTipoToppings() {
        return "Salami ";
    }

    public String toString (){
        return getTipoMasa() + getTipoQueso() + getTipoToppings();
    }
}
