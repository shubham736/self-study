package program.interview;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OutputOfCode {
    public static void main(String[] args) {

    }

    // Question1
    static void doSomething() {
        throw new RuntimeException(new Exception(""));
    }
    /*  No compile time error as because this a chaining exception and the compiler only
        care about the first one in the chain
        so we don't need to add throw clause here.*/

    void question2OutputOfCode() {
        List object = Arrays.asList("sun mon tue wed thu fri sat".split(" "));
        System.out.println("List : " + object);
        Collections.rotate(object, 3);
        System.out.println("Rotate " + object);
    }

    void question3Code() {
        try {
            Class c = Class.forName("program.interview.model.Employee");
            Field fields[] = c.getFields();
            for (Field field : fields) {
                field.setAccessible(true);
                System.out.println(field);
            }
        } catch (Exception e) {
            System.out.println("You can do it");
        }
    }

    void question4Code() {
        try {
            FileOutputStream fos = new FileOutputStream("serial");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeFloat(3.5f);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            System.out.println("Serialization " + e);
            System.exit(0);
        }
        try {
            FileInputStream fis = new FileInputStream("serial");
            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println(ois.available());
        } catch (Exception e) {
            System.out.println("Serialization " + e);
            System.exit(0);
        }
    }

    void question5Code() {
        String s1 = "def";
        String s2 = s1;
        s1 += "g";
        System.out.println(s1 + " " + s2 + " " + (s1 == s2));
        StringBuilder a = new StringBuilder("def");
        StringBuilder b = a;
        a.append("g");
        System.out.println(a + " " + b + " " + (a == b));
    }
}
