package sports;

import java.util.Arrays;

public class FootballPlayer implements Cloneable {
    private String name;
    private int[] goals;

    public FootballPlayer(String name, int[] goals) {
        this.name = name;
        this.goals = goals!=null ? goals.clone(): new int [5];
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        FootballPlayer clone = (FootballPlayer)super.clone();
        clone.goals = goals.clone();
        return clone;
    }
    public void changeLastGoal(int liczba)
    {
        goals[goals.length-1]=liczba;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name='" + name + '\'' +
                ", goals=" + Arrays.toString(goals) +
                '}';
    }
}

class TestFootballPlayer {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] tab= {1,2,3,4,5};
        FootballPlayer f1 = new FootballPlayer("Messi",tab);
        FootballPlayer f2= (FootballPlayer) f1.clone();
        f1.changeLastGoal(213);
        System.out.println(f1);
        System.out.println(f2);
    }
}