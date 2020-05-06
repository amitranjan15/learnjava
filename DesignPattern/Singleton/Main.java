package DesignPattern.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    System.out.println(SingletonLazyBillPugh.getInstance());
    System.out.println(SingletonLazyBillPugh.getInstance());
    System.out.println(SingletonLazyBillPugh.getInstance());

    SingletonLazyBillPugh newobj=null;
    for(Constructor constructor: SingletonLazyBillPugh.class.getDeclaredConstructors())
    {
        constructor.setAccessible(true);
        newobj=(SingletonLazyBillPugh)constructor.newInstance();
        break;
    }
    Enum e=Enum.OBJECT;
    Enum e2=Enum.OBJECT;
    System.out.println(e.hashCode());
    System.out.println(e2.hashCode());
}
}