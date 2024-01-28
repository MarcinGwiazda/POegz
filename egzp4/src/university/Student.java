package university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public record Student(String name, double averageGrade, int yearOfStudy) implements Comparable<Student>{
    @Override
    public int compareTo(Student o) {
        int comp = Double.compare(o.averageGrade, this.averageGrade);
        if (comp == 0)
        {
           return Integer.compare(this.yearOfStudy,o.yearOfStudy);
        }
        return comp;
    }
}

class test {
    public static void main(String[] args) {
        Student s1 = new Student("Jan",4,1);
        Student s2 = new Student("Piotr",3.5,2);
        Student s3 = new Student("Marek",5,4);
        Student s4 = new Student("Macius",4,3);
        ArrayList<Student> lista=new ArrayList<>(Arrays.asList(s1,s2,s3,s4));
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
    }
}