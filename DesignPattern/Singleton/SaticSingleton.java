package DesignPattern.Singleton;

public class SaticSingleton {
    private static SaticSingleton OBJ = null;
    static {
        if (OBJ == null)
            OBJ = new SaticSingleton();
    }

    private SaticSingleton() {
    }

    public static SaticSingleton getInstance() {
        return OBJ;
    }
}