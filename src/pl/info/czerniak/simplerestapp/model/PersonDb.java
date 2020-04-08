package pl.info.czerniak.simplerestapp.model;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PersonDb {
    private static Map<Long, Person> persons = new ConcurrentHashMap<>();

    static {
        persons.put(1L, new Person(1, "Sebastian", "Kowalski"));
        persons.put(2L, new Person(1, "Dżesika", "kowalska"));
        persons.put(3L, new Person(1, "Brajan", "Kowalski"));
    }

    public static Map<Long, Person> getPersons(){
        return persons;
    }

    public static void addPerson(Person person){
        if(persons == null){
            getPersons();
        }
        persons.put(person.getId(), person);
    }

    public static Person removePerson(Long id){
        if(persons == null){
            getPersons();
        }
        return persons.remove(id);
    }
}
