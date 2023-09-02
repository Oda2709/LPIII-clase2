package src.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    private  static final  int OPCION_SALIR = 6;

    //main o psvm
    public static void main(String[] args) {
        Map<Integer, Accion> strategy = AccionHandler.getStrategy();
        /* Map<Integer, Accion> strategy = new HashMap<>();
        strategy.put(1, new AccionCrear());
        strategy.put(2, new AccionLeer());
        strategy.put(3, new AccionActualizar());
        strategy.put(4, new AccionEliminar());*/

        int opcion;
        do {
            System.out.println("Ingrese una opción");
            opcion = scanner.nextInt();
            scanner.nextLine();
            Accion accion = strategy.get(opcion);
            if (OPCION_SALIR == opcion){
                continue;
            }
            if (accion == null) {
                System.out.println("Esta opción no existe");
            }else {
                accion.aplicar();
            }
        } while (OPCION_SALIR != opcion);
        System.out.println("Salida exitosa");
    }
}
