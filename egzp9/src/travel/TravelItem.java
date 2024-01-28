package travel;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TravelItem implements Comparable<TravelItem> {
    private String name;
    private double weight;
    private double volume;

    public TravelItem(String name, double weight, double volume) {
        this.name = name;
        this.weight = weight;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "TravelItem{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", volume=" + volume +
                '}';
    }

    @Override
    public int compareTo(TravelItem o) {
        return Double.compare(this.weight,o.weight);
    }
}

class TestTravelItem {
    public static void main(String[] args) {
        TravelItem t1= new TravelItem("Jedzienie",5.0,20);
        TravelItem t2= new TravelItem("Mapa",0.1,1);
        TravelItem t3= new TravelItem("Napoje",15.0,40);
        TravelItem t4= new TravelItem("Namiot",4.0,2);
        TravelItem[] tab= new TravelItem[4];
        tab[0]=t1;
        tab[1]=t2;
        tab[2]=t3;
        tab[3]=t4;
        for(TravelItem x: tab)
        {
            System.out.print(x+" ");
        }
        Arrays.sort(tab,TravelItem::compareTo);
        System.out.println();
        for(TravelItem x: tab)
        {
            System.out.print(x+" ");
        }
    }
}