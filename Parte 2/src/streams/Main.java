package streams;

import javax.print.attribute.ResolutionSyntax;
import java.lang.module.ResolutionException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(1L,20,"andres"));
        empleados.add(new Empleado(61L,18,"luisa"));
        empleados.add(new Empleado(20L,17,"oda"));

        Set<String> nombres = empleados.stream()
                .map(empleado -> empleado.getNombre())

                .collect(Collectors.toSet());
        System.out.println(nombres);
        System.out.println(empleados);


        Set<Character> iniciales = empleados.stream()
                .map(empleado -> empleado.getNombre())
                .map(nombre -> nombre.charAt(0))
                .collect(Collectors.toSet());

        System.out.println(iniciales);

        /// Filtrado por edad
        Set<Empleado> filtroedad = empleados.stream()
                .filter(empleado -> empleado.getEdad() >18)
                .collect(Collectors.toSet());

        System.out.println(filtroedad);

        /// Filtrado por tengan nombre distinto a 'a'
        Set<Empleado> empleadosfiltro = empleados.stream()
                .filter(empleado -> empleado.getNombre().charAt(0) !='a')
                .collect(Collectors.toSet());

        System.out.println(empleadosfiltro);

        ///max
        Optional<Empleado> empleadosedadmaxima = empleados.stream()
                .max(Comparator.comparing(empleado -> empleado.getEdad()));

        System.out.println(empleadosedadmaxima);

        Optional<Empleado> empleadosid= empleados.stream()
                .max(Comparator.comparing(empleado -> empleado.getId()));

        System.out.println(empleadosid);

        ///min
        Optional<Empleado> empleadosedadminima = empleados.stream()
                .min(Comparator.comparing(empleado -> empleado.getEdad()));

        System.out.println(empleadosedadminima);


        ///el nombre mas largo
        Optional<Empleado> length = empleados.stream()
                .max(Comparator.comparing(empleado -> empleado.getNombre().length()));

        System.out.println(length);

        ///entrega el primero solo uno
        Optional<Empleado> solo1 = empleados.stream()
                        .filter(empleado -> empleado.getNombre().toUpperCase().charAt(0) == 'a')
                                .findFirst();

        System.out.println(solo1);

        //crear un mapa ip y objeto

        Map<Long, Empleado> MapObj = empleados.stream()
                .collect(Collectors.toMap(empleado -> empleado.getId(), empleado -> empleado));

        System.out.println(MapObj);

        //forEach
        empleados.stream()
                .map(empleado -> empleado.getId())
                .forEach(System.out::println); // ::


        //opcionalempleado
        Optional<Empleado> opcionalempleado = Optional.of(new Empleado(4L,10,"Hola"))
                        .filter(empleado -> empleado.getEdad() > 18);
        System.out.println( "---------------" + opcionalempleado.isPresent());

        //por dentro hace la validación
        opcionalempleado.orElse(null);

        // para lanzar una excepción si el valor no existe
        opcionalempleado.orElseThrow(null);
        
        //
        opcionalempleado.orElseGet(() -> new Empleado(4L,23, "Tata"));
    }

}
