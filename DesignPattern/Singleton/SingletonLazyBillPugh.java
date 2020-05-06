package DesignPattern.Singleton;

public class SingletonLazyBillPugh {

    private SingletonLazyBillPugh() {
    }

    static class BillPugh {
        private static SingletonLazyBillPugh INSTANCE = new SingletonLazyBillPugh();
    }

    public static SingletonLazyBillPugh getInstance() {

        return BillPugh.INSTANCE;
    }
}