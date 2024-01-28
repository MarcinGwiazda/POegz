package restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Chef {
    private int id;
    private String name;
    private double skillLevel;

    public Chef(int id, String name, double skillLevel) {
        this.id = id;
        this.name = name;
        this.skillLevel = skillLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(double skillLevel) {
        this.skillLevel = skillLevel;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skillLevel=" + skillLevel +
                '}';
    }
}

class SkillLevelComapator implements Comparator<Chef>
{

    @Override
    public int compare(Chef o1, Chef o2) {
        int wynik= Double.compare(o2.getSkillLevel(),o1.getSkillLevel());
        if(wynik!=0) return wynik;
        else return o1.getName().compareTo(o2.getName());
    }
}

class TestChef {
    public static void main(String[] args) {
        Chef c1 = new Chef(1,"Jeff",4.5);
        Chef c2 = new Chef(2,"Janusz",3.0);
        Chef c3 = new Chef(3,"Marek",4.0);
        Chef c4 = new Chef(4,"Macius",5.0);
        Chef c5 = new Chef(5,"Jakub",3.5);
        ArrayList<Chef>lista=new ArrayList<>(Arrays.asList(c1,c2,c3,c4,c5));
        System.out.println(lista);
        lista.sort(new SkillLevelComapator());
        System.out.println(lista);
    }
}
