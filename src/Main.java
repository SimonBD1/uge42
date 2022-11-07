import comparatorer.AlderComparator;
import comparatorer.NavnComparator;
import person.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    int [] tal = {6,3,7,5,9};
    Arrays.sort(tal);
        System.out.println(Arrays.toString(tal));
        Person p1 = new Person("Hans",24);
        Person p2 = new Person("Ole",22);
        Person p3 = new Person("Bent",19);
        Person p4 = new Person("Albert",82);
        Person p5 = new Person("Albert",24);

        Person[] personer = {p1,p2,p3,p4};

        Arrays.sort(personer, new NavnComparator());
        System.out.println("Personliste sorteret efter navn: " + Arrays.toString(personer));

        ArrayList<Person> personliste = new ArrayList<Person>(List.of(p1,p2,p3,p4,p5));

        Collections.sort(personliste, new NavnComparator().thenComparing(new AlderComparator().reversed()));
        System.out.println("Personliste sorteret efter alder: " + personliste);

        Collections.sort(personliste, new NavnComparator());
        System.out.println("Personliste sorteret primært efter navn, derefter alder: " + personliste);

    }
}
