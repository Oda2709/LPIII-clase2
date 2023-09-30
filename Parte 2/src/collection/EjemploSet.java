package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class EjemploSet {
    public static void main(String[] args) {
        Set<Integer> integers = new LinkedHashSet<>(); // lo inserta al final
        integers.add(1);
        integers.add(5);
        System.out.println(integers);
        integers.add(5);
        System.out.println(integers);
        integers.addAll(Set.of(5,1,2,3,8,20,24,65));
        System.out.println(integers);
        integers.add(25);
        System.out.println(integers);

        //Set<Integer> integers = new HashSet<>(); // Lo inserta como le da la gana
    }
}
