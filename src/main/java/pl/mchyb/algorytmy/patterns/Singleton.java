package pl.mchyb.algorytmy.patterns;

public class Singleton {

    private static Singleton singletonInstance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singletonInstance == null) {
            synchronized (Singleton.class) {
                singletonInstance = new Singleton();
            }
        }
        return singletonInstance;
    }
}
