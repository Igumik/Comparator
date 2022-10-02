import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int maxSurname;

    public PersonComparator(int maxSurname) {
        this.maxSurname = maxSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] s1 = o1.getSurname().split("\\P{IsAlphabetic}+");
        String[] s2 = o2.getSurname().split("\\P{IsAlphabetic}+");
        if (s1.length == s2.length) {
            return Integer.compare(o2.getAge(), o1.getAge());
        } else if (maxSurname <= s1.length && maxSurname <= s2.length) {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
        return Integer.compare(s2.length, s1.length);
    }
}
