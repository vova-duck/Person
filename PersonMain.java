package HomeWork12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonMain {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Person child = createChild();
        System.out.println();
    }
    public static Person createFather() throws IOException {
        System.out.println("Type name of father: ");
        String name = reader.readLine();
        return new Person(name);
    }
    public static Person createMather() throws IOException {
        System.out.println("Type name of mather: ");
        String name = reader.readLine();

        return new Person(name);
    }
    public static Person createChild() throws IOException {
        System.out.println("Type name of child: ");
        String name = reader.readLine();
        return new Person(name, createFather(), createMather());
    }
}
