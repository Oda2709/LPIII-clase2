package generics;

public abstract class Creador  <T extends  Juguete> { // operador de tipo generico.. normalmente es una sola letra T por tipo

   /* public T crear() {
        System.out.println("Creando");
        return (T) new Object();
    }*/

    public abstract T crear();
}
