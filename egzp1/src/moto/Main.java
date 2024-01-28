package moto;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer[] tab={21,32,125,23,100};
        Vehicle v1= new Vehicle("Car",200);
        Vehicle v2= new Vehicle("Bike",40);
        Vehicle v3 = new Vehicle("Airplane",800);
        Vehicle v4 = new Vehicle("Motocycle",150);
        Vehicle v5 = new Vehicle("Truck",140);
        Vehicle[] tab2= {v1,v2,v3,v4,v5};
        System.out.println(maxValue(tab2));

    }
    public static <T extends Comparable<T>> T maxValue(T[] tab)
    {
        T max = tab[0];
        if (tab == null || tab.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }
        for(int i =0;i<tab.length-1;i++)
        {
            if(tab[i].compareTo(max)>0)
            {
                max=tab[i];
            }
        }
        return max;
    }
}

class Vehicle implements Comparable<Vehicle>
{
    public String model;
    public int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public int compareTo(Vehicle o) {
        return this.speed-o.speed;
    }
}
