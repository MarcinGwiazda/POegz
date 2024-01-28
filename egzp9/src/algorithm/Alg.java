package algorithm;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Alg {
    public static void main(String[] args) {
        TreeMap<String,Integer>mapa=new TreeMap<>();
        mapa.put("klucz1",5);
        mapa.put("klucz2",10);
        mapa.put("klucz3",21);
        mapa.put("klucz4",321);
        System.out.println(mapa);
        System.out.println(mapToString(mapa));
        TreeMap<Person,Integer>mapa2=new TreeMap<>(new PersonComparator());
        Person p1= new Person("Janusz");
        Person p2= new Person("Macius");
        Person p3= new Person("Piotr");
        Person p4= new Person("Szymon");
        mapa2.put(p1,1);
        mapa2.put(p2,2);
        mapa2.put(p4,4);
        mapa2.put(p3,12);
        System.out.println(mapa2);
        System.out.println(mapToString(mapa2));

    }

    public static <K,V> String mapToString(TreeMap<K,V>map)
    {
        StringBuilder sb= new StringBuilder();
        for(Map.Entry x: map.entrySet())
        {
            sb.append(x.getKey());
            sb.append(":");
            sb.append(x.getValue());
            sb.append(", ");
        }
        sb.delete(sb.length()-2,sb.length());
        return sb.toString();
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

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class PersonComparator implements Comparator<Person>
{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}