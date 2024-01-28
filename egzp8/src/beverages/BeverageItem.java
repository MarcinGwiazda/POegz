package beverages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BeverageItem implements Comparable<BeverageItem> {
    private String name;
    private double volume;
    private double sugarContent;

    public BeverageItem(String name, double volume, double sugarContent) {
        this.name = name;
        this.volume = volume;
        this.sugarContent = sugarContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(double sugarContent) {
        this.sugarContent = sugarContent;
    }

    @Override
    public String toString() {
        return "BeverageItem{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", sugarContent=" + sugarContent +
                '}';
    }

    @Override
    public int compareTo(BeverageItem o) {
        return Double.compare(this.sugarContent,o.sugarContent);
    }
}

class TestBeverageItem {
    public static void main(String[] args) {
        BeverageItem i1 = new BeverageItem("Whiskey",40,0.1);
        BeverageItem i2 = new BeverageItem("Zoladkowa",30,10);
        BeverageItem i3 = new BeverageItem("Finlandia",35,15);
        BeverageItem i4 = new BeverageItem("Stock",40,10);
        ArrayList<BeverageItem> lista= new ArrayList<>(Arrays.asList(i1,i2,i3,i4));
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
    }
}