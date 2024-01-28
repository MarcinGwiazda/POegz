package university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public record Student(int id, String name, double averageGrade) {
}

class AverageGradeComparator implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.averageGrade(),o1.averageGrade());
    }
}

class IdComparator implements Comparator<Student>
{
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.id(),o2.id());
    }
}

class testStudenta {
    public static void main(String[] args) {
        Student s1= new Student(141,"Kuba",4);
        Student s2= new Student(142,"Macius",4.5);
        Student s3= new Student(147,"Janusz",4.75);
        Student s4= new Student(145,"Marek",4.5);
        Student s5= new Student(144,"Janek",3.5);
        ArrayList<Student>lista= new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));
        System.out.println(lista);
        Collections.sort(lista,new AverageGradeComparator().thenComparing(new IdComparator()));
        System.out.println(lista);
    }
}