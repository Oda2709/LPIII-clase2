package collection;

import java.util.ArrayList;
import java.util.List;

public class EjemploList {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hola");
        strings.add("Chao");
        strings.add("Amor");

        System.out.println(strings);

        strings.add("Mundo");
       // System.out.println(strings);
        strings.remove("     Amor".trim()); // una forma
        //System.out.println(strings);
        strings.remove(0); // otra forma
       // System.out.println(strings);
        strings.addAll(List.of("Saludo"," despedida".trim()));
        //System.out.println(strings);
        strings.add(3,"entre");
        // List<String> strings = new LikendList<>();
       // System.out.println(strings);


        System.out.println("Enhanced for");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("For each");
        strings.forEach(string-> System.out.println(string));

    }
}
