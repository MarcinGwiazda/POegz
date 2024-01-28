package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] tab={12,21,21,21,3,5};
        Integer el= 5;
        System.out.println(countLessThanOrEqual(tab,el));
        Person p1 = new Person("Janek",15);
        Person p2 = new Person("Macius",12);
        Person p3 = new Person("Piotr",20);
        Person[] tablica= new Person[3];
        tablica[0]=p1;
        tablica[1]=p2;
        tablica[2]=p3;
        ArrayList<Person> lista= new ArrayList<>(Arrays.asList(p1,p2,p3));
        System.out.println(tablica[0]);
        System.out.println(tablica[1]);
        System.out.println(tablica[2]);
        Arrays.sort(tablica,Person::compareTo);
        System.out.println();
        System.out.println(tablica[0]);
        System.out.println(tablica[1]);
        System.out.println(tablica[2]);
        System.out.println(countLessThanOrEqual(tablica,tablica[2]));
    }

    public static <T extends Comparable<T>> int countLessThanOrEqual(T[]tab,T el)
    {
        int licznik=0;
        for(int i=0;i<tab.length;i++)
        {
            if(tab[i].compareTo(el)<=0)
            {
                licznik++;
            }
        }
        return licznik;
    }
}

class Person implements Comparable<Person>
{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.getAge(),o.getAge());
    }
}