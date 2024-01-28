package university;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", 85.5),
                new Student("Bob", 90.0),
                new Student("Charlie", 75.8),
                new Student("Alice", 85.5)  // Ten sam student co wcześniej
        );

        // Wywołanie metody countElements
        Student searchStudent = new Student("Alice", 85.5);
        int count = countElements(students.iterator(), searchStudent);
        System.out.println(count);
    }

    public static<T> int countElements(Iterator<T> items, T element)
    {
        int wynik=0;
        while (items.hasNext()) {
            T currentItem = items.next();
            if (currentItem != null && currentItem.equals(element)) {
                wynik++;
            }
        }
        return wynik;
    }
}

class Student
{
    public String name;
    public double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.grade, grade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }
}

