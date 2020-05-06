package DesignPattern.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonWithSerialization {
    public static void main(final String[] args) throws IOException {
        final InnerSingletonWithSerialization single = InnerSingletonWithSerialization.getInstance();
        InnerSingletonWithSerialization singleGet = null;
        ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("ab.txt"));
        try (objectOutput) {
            objectOutput.writeObject(single);
            objectOutput.flush();

        } catch (final Exception e) {
            e.printStackTrace();
        }

        final ObjectInput input = new ObjectInputStream(new FileInputStream("ab.txt"));

        try (input) {
            Object obj = input.readObject();
            singleGet = (InnerSingletonWithSerialization) obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(single.hashCode());
        System.out.println(singleGet.hashCode());
    }
}

/**
 * InnerSingletonWithSerialization
 */
class InnerSingletonWithSerialization implements Serializable {

    private static final long serialVerisonUID = 2L;
    private static InnerSingletonWithSerialization obj = null;

    private InnerSingletonWithSerialization() {
    }

    public static InnerSingletonWithSerialization getInstance() {
        if (obj == null) {
            obj = new InnerSingletonWithSerialization();
        }
        return obj;
    }

    private Object readResolve() {
        return getInstance();
    }
}