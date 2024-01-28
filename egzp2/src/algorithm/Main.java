package algorithm;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Janek",(float)3.4);
        Student s2 = new Student("Janek",(float)3.4);
        Student s3 = new Student("Janek",(float)3.4);
        System.out.println(compareThree(s1,s2,s3));
    }
    public static <T> boolean compareThree(T first,T second, T third)
    {
        if(first.equals(second)&&first.equals(third))
        {
            return true;
        }
        return false;
    }
}
class Student
{
    public String name;
    public float grade;

    public Student(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Float.compare(student.grade, grade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }
}
