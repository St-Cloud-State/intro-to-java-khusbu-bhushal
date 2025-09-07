import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
import java.io.FileNotFoundException;

public class MyMain {

    public static void main(String[] args) throws FileNotFoundException {
        // create empty LinkedList
        LinkedList<Person> people = new LinkedList<>();

        //      open input file
        Scanner in = new Scanner(new File("people.txt"));

        // store data into LinkedList
        store(in, people);

        // display all people
        display(System.out, people);

        // test method
        System.out.println("Index of ID = 997: " + find("997", people));
        System.out.println("Index of ID = 233: " + find("233", people));

        in.close(); // optional but nice
    }

    // read Person objects from file into list

    public static void store(Scanner in, LinkedList<Person> list) {
        while (in.hasNext()) {
            String id    = in.next();
            String first = in.next();
            String last  = in.next();
            list.add(new Person(first, last, id));
        }
    }

    // print all people in list
    
    public static void display(PrintStream out, LinkedList<Person> list) {
        for (Person p : list) {
            out.println(p);   // uses Person.toString()
        }
    }



    // return index of Peson with given id or -1 if not found
    public static int find(String sid, LinkedList<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(sid)) {
                return i;
            }
        }
        return -1;
    }
}
