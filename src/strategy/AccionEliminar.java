package src.strategy;

public class AccionEliminar implements Accion {

    @Override
    public void aplicar() {
        System.out.println("Estoy Eliminando");
    }

    @Override
    public int getOpcion() {
        return 4;
    }
}
