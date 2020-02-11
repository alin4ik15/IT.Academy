package main.java.streamapi.task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Lena", 27),
                new Person("Igor", 35),
                new Person("Alina", 25),
                new Person("Maxim", 20),
                new Person("Ilia", 40)
        );

        System.out.println("Sorted by name");
        persons.sort(Comparator.comparing(Person::getName));
        persons.forEach(System.out::println);
        System.out.println("Sorted by age");
        persons.sort(Comparator.comparing(Person::getAge));
        persons.forEach(System.out::println);
        System.out.println();

    }
}
