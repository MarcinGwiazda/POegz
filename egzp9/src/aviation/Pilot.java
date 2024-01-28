package aviation;

import java.util.ArrayList;

public class Pilot implements Cloneable{
    private String name;
    private ArrayList<Double> flightHours;

    public Pilot(String name, ArrayList<Double> flightHours) {
        this.name = name;
        this.flightHours = flightHours!=null ? new ArrayList<>(flightHours): new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getFlightHours() {
        return new ArrayList<>(flightHours);
    }

    public void setFlightHours(ArrayList<Double> flightHours) {
        this.flightHours = flightHours!=null ? new ArrayList<>(flightHours): new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", flightHours=" + flightHours +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pilot clonedPilot = (Pilot) super.clone();
        // Głębokie kopiowanie ArrayList
        clonedPilot.flightHours = new ArrayList<>(this.flightHours);
        return clonedPilot;
    }

    public void changeFlightHours(int miejsce,Double nowaWar)
    {
        this.flightHours.set(miejsce-1,nowaWar);
    }
}

class TestPilot {
    public static void main(String[] args) throws CloneNotSupportedException{
        ArrayList<Double> lista= new ArrayList<>();
        lista.add(2.5);
        lista.add(6.0);
        lista.add(7.5);
        Pilot p1 = new Pilot("Janusz",lista);
        Pilot p2 =(Pilot)p1.clone();
        p1.changeFlightHours(3,5.2);
        System.out.println(p1);
        System.out.println(p2);
    }
}