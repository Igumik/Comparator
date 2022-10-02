import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Эллой", "Хорайзан ван лав", 21));
        people.add(new Person("Артур", "Морган фримен халф", 46));
        people.add(new Person("Дзин", "Сакай", 34));
        people.add(new Person("Тим", "Кук-аппле", 61));

        System.out.println(people);
        System.out.println();
        Comparator<Person> comp = (p1, p2) -> {
            String[] s1 = p1.getSurname().split("\\P{IsAlphabetic}+");
            String[] s2 = p2.getSurname().split("\\P{IsAlphabetic}+");
            int maxSurname = 3;
            if (s1.length == s2.length) {
                return Integer.compare(p2.getAge(), p1.getAge());
            } else if (maxSurname <= s1.length && maxSurname <= s2.length) {
                return Integer.compare(p2.getAge(), p1.getAge());
            }
            return Integer.compare(s2.length, s1.length);
        };

        Collections.sort(people, comp);
        for (Person p : people) {
            System.out.println(p.getSurname() + " " + p.getAge() + " лет");
        }
    }
}
