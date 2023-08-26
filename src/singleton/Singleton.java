package src.singleton;

public class Singleton {
    private static Singleton intance;
    private Singleton(){ //solo el puede reservar -- constructor

    }
    public static Singleton getInstance(){
        if (intance == null){
            intance = new Singleton();
        }
        return intance;

    }
}
