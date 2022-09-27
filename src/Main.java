import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Эллой", "Хорайзан ван лав", 21));
        people.add(new Person("Артур", "Морган фримен халф", 46));
        people.add(new Person("Дзин", "Сакай", 34));
        people.add(new Person("Тим", "Кук аппле", 61));

        System.out.println(people);
        System.out.println();
        Collections.sort(people, new PersonComparator(3));
        for (Person p : people) {
            System.out.println(p.getSurname() + " " + p.getAge() + " лет");
        }
    }
}
