package collection;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class EjemploMap { // el mapa no es una coleccion
    public static void main(String[] args) {
        Map <Integer, String> map = new HashMap<>();
        map.put(4, "AccionEliminar");
        map.put(3, "AccionMostrar");
       // System.out.println(map); // control + d duplica la linea  -- control shit muevo las lineas --
        // clic derecho refactor name
        map.put(20, "Accioncualquiera");
        map.put(11, "Accioncualquiera");
        map.put(11, "Accioncualquiera5");  // si ya existe lo sobreescribe
        //System.out.println(map);
        String value2o = map.get(20);
      //  System.out.println(value2o);
        String value2 = map.get(11);
        //System.out.println(value2);

        map.forEach((key, value) ->System.out.println("Key:" + key + "->" + "Value:" + value));


    }
}
