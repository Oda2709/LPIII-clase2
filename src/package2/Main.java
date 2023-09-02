package src.package2;

import src.builder.Empleado;
import src.factorymethod.Creadorpizahawaiana;
import src.factorymethod.Creadorpizza;
import src.factorymethod.Pizza;
import src.prototype.Estudiante;
import src.singleton.Singleton;

import java.net.StandardSocketOptions;

public class Main {

    public static void main (String [] arg){
       /* Empleado empleado = Empleado.builder()
                .id(123)
                .nombre ("Jorge")
                .build();
        System.out.print (empleado);*/

//        Estudiante estudiante = new Estudiante("Oda", 1234L, 8 );
//        Estudiante estudiante2 = estudiante.clone();
//
//        System.out.println(estudiante == estudiante2);
//        System.out.println("Estudiante 1" + estudiante);
//        System.out.println("Estudiante 2" + estudiante);

//        Creadorpizza creadorpizza = new Creadorpizahawaiana();
//        Pizza pizza = creadorpizza.crear();
//        System.out.println(pizza.getTipoMasa() + " " + pizza.getTipoQueso() +" " + pizza.getTipoToppings());

          Creadorpizza creadorpizza = new Creadorpizahawaiana();
          Pizza pizza = crearPizza(creadorpizza);
          System.out.println(pizza);

   }

   public static  Pizza crearPizza(Creadorpizza creadorpizza){
        return creadorpizza.crear();
   }
}
