package sports;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Athlete {
    public String name;
    public String nationality;
    public double records;

    public Athlete(String name, String nationality, double records) {
        this.name = name;
        this.nationality = nationality;
        this.records = records;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", records=" + records +
                '\n';
    }
}

class RecordComparator implements Comparator<Athlete>
{

    @Override
    public int compare(Athlete o1, Athlete o2) {
        if(o1.records==o2.records)
        {
            if(o1.nationality.equals(o2.nationality))
            {
                return o2.name.compareTo(o1.name);
            }
            return o2.nationality.compareTo(o1.nationality);
        }
        return (int)Math.signum(o1.records-o2.records);
    }
}

class NationalityNameComparator implements Comparator<Athlete>
{

    @Override
    public int compare(Athlete o1, Athlete o2) {
        if(o1.nationality.equals(o2.nationality))
        {
            return o2.name.compareTo(o1.name);
        }
        return o2.nationality.compareTo(o1.nationality);
    }
}

class TestAthlete {
    public static void main(String[] args) {
        Athlete a1= new Athlete("Robert Lewandowski","Poland", 91.5);
        Athlete a2= new Athlete("Leo Messi","Argentina", 94.5);
        Athlete a3= new Athlete("Cristiano Ronaldo","Portugal", 94.5);
        Athlete a4= new Athlete("Diego Maradona","Argentina", 94);
        Athlete a5= new Athlete("Pele","Brazil", 94);
        ArrayList<Athlete> lista = new ArrayList<>(Arrays.asList(a1,a2,a3,a4,a5));
        System.out.println(lista);
        lista.sort(new RecordComparator());
        System.out.println(lista);
        lista.sort(new NationalityNameComparator());
        System.out.println(lista);
    }
}