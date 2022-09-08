package ru.lynant.springlearn.dao;

import org.springframework.stereotype.Component;
import ru.lynant.springlearn.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private final List<Person> people;
    PersonDAO() {
        people = new ArrayList<>();

        people.add(new Person(PEOPLE_COUNT++, "Tom", "tom@gmail.ocm", 34));
        people.add(new Person(PEOPLE_COUNT++, "Bob", "bob@gmail.com", 25));
        people.add(new Person(PEOPLE_COUNT++, "Mike","mike@gmail.com", 59));
        people.add(new Person(PEOPLE_COUNT++, "Katy","katy@gmail.com", 71));
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
    public void update(int id, Person updatedPerson) {
        show(id).setName(updatedPerson.getName());
        show(id).setEmail(updatedPerson.getEmail());
        show(id).setAge(updatedPerson.getAge());
    }

    public void delete(int id) {
        people.remove(id);
    }
}
