package sports;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public record Athlete(String name, String sport, int yearOfAchievement) implements Comparable<Athlete> {

    @Override
    public int compareTo(Athlete o) {
        return Integer.compare(this.yearOfAchievement,o.yearOfAchievement);
    }
}

class testAthlete {
    public static void main(String[] args) {
        Athlete a2 =new Athlete("Messi","Football",2012);
        Athlete a1 = new Athlete("Ronaldo","Football",2017);
        Athlete a4 = new Athlete("Lewandowski","Football",2020);
        Athlete a3 = new Athlete("Swiatek","Tennis",2023);
        ArrayList<Athlete>lista=new ArrayList<>(Arrays.asList(a1,a2,a3,a4));
        System.out.println(lista);
        //lista.sort(Athlete::compareTo);
        Collections.sort(lista);
        System.out.println(lista);
    }
}