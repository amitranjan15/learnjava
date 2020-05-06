package DesignPattern.Singleton;

public class SingletonWithClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        InnerSingletonWithClone singleton = InnerSingletonWithClone.getInstan();
        InnerSingletonWithClone singleton2 = (InnerSingletonWithClone)singleton.clone();
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

/**
 * InnerSingletonWithClone
 */
class InnerSingletonWithClone implements Cloneable {

    private InnerSingletonWithClone() {
    }

    private static InnerSingletonWithClone obj;

    public static InnerSingletonWithClone getInstan() {
        if (obj == null) {
            obj = new InnerSingletonWithClone();
        }
        return obj;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return getInstan();
        // throw new CloneNotSupportedException("you can't create clone object for this class");
    }
}