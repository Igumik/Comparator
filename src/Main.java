import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Эллой", "Хорайзан ван лав", 21));
        people.add(new Person("Артур", "Морган фримен халф", 46));
        people.add(new Person("Маилз", "Моралис", 16));
        people.add(new Person("Дзин", "Сакай", 34));
        people.add(new Person("Тим", "Кук аппле", 61));
        people.add(new Person("Дим", "Димыч", 9));

        System.out.println(people);
        System.out.println();

        people.removeIf(minAge -> minAge.getAge() < 18);
        System.out.println(people);
    }
}
