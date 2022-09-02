package ru.lynant.springlearn.dao;

import org.springframework.stereotype.Component;
import ru.lynant.springlearn.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    PersonDAO() {
        people = new ArrayList<>();

        people.add(new Person(PEOPLE_COUNT++, "Tom"));
        people.add(new Person(PEOPLE_COUNT++, "Bob"));
        people.add(new Person(PEOPLE_COUNT++, "Mike"));
        people.add(new Person(PEOPLE_COUNT++, "Katy"));
    }

    public List<Person> getPeople() {
        return people;
    }

    public Person show(int id) {
        return people.get(id);

    }

    public void save(Person person) {
        person.setId(PEOPLE_COUNT++);
        people.add(person);
    }
}
