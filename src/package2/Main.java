package src.package2;

import src.builder.Empleado;
import src.singleton.Singleton;

public class Main {

    public static void main (String [] arg){
        Empleado empleado = Empleado.builder()
                .id(123)
                .nombre ("Jorge")
                .build();
        System.out.print (empleado);
   }
}
