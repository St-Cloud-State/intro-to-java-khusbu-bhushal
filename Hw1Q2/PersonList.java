// PersonList.java
import java.util.LinkedList;
import java.util.Scanner;
import java.io.PrintStream;

public class PersonList {
    private final LinkedList<Person> people = new LinkedList<>();

    //  store( Scanner)
    public void store(Scanner in) {
        while (in.hasNext()) {
            String id    = in.next();
            String first = in.next();
            String last  = in.next();
            people.add(new Person(first, last, id));
        }
    }

    // display(Print Stream)

    public void display(PrintStream out) {
        for (Person p : people) out.println(p);
    }

    //          find(sid)
    public int find(String sid) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId().equals(sid)) return i;
        }
        return -1;
    }



    public int size() { return people.size(); }
    public Person get(int index) { return people.get(index); }
}
