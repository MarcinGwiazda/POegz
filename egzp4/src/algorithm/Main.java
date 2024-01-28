package algorithm;

import java.util.HashMap;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        HashMap<Person,String> hasz = new HashMap<>();


        Person person1 = new Person("John");
        Person person2 = new Person("Jane");
        Person person3 = new Person("John");

        hasz.put(person1,"value1");
        hasz.put(person2,"value2");
        hasz.put(person3,"value3");
        System.out.println(hasz);
        System.out.println(countUniqueKeys(hasz));
    }

    public static <K,V> int countUniqueKeys(HashMap<K,V> wartosci)
    {
        int wynik=0;
        for(K wartosc: wartosci.keySet())
        {
            wynik++;
        }
        return wynik;
    }
}

class Person
{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}