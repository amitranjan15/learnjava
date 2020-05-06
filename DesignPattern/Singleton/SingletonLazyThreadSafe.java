package DesignPattern.Singleton;

public class SingletonLazyThreadSafe {
    private static SingletonLazyThreadSafe INSTANCE = null;

    private SingletonLazyThreadSafe() {
    }

    public static SingletonLazyThreadSafe getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonLazyThreadSafe.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonLazyThreadSafe();
                }
            }
        }
        return INSTANCE;
    }
}