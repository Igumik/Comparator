public class Person implements Comparable<Person> {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(Person p) {
        return name.compareTo(p.getName());
    }

    @Override
    public String toString() {
        return name + " " + surname + ", " + age + " лет";
    }
}
