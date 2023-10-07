package funcional;

import generics.MiInterfazFuncional;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function <Integer, String> function =  (Integer integer) -> integer.toString() +  "Este es el numero: ";
        String string = function.apply(8);

        MiInterfazFuncional <String, Integer> miInterfazFuncional = ( stringParam, stringParam2) ->  {
            System.out.println("Valor de entrada: " + stringParam + stringParam2);
            return 50;
        };
        System.out.println(string);
        System.out.println(miInterfazFuncional.aplicar("100  ","  2"));
    }
}
