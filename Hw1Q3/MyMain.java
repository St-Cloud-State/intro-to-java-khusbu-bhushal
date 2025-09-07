import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) throws FileNotFoundException {
        PersonList plist = new PersonList();

        try (Scanner in = new Scanner(new File("people.txt"))) {
            plist.store(in);
        }

        plist.display(System.out);

        System.out.println("Index of 145: " + plist.find("145")); // should return 0
    System.out.println("Index of 999: " + plist.find("999")); //  returns -1

    }
}
