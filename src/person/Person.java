package person;

public class Person implements Comparable<Person> {

    private String navn;
    private int alder;

    public Person(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }

    public String getNavn() {
        return navn;
    }

    public int getAlder() {
        return alder;
    }

    public int compareTo(Person p){
        //return navn.compareTo(p.getNavn());
        return alder - p.getAlder();

    }

    @Override
    public String toString() {
        return  navn + " " + alder+"år";
    }
}
