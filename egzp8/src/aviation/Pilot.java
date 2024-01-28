package aviation;

import java.util.Arrays;

public class Pilot implements Cloneable {
    private String name;
    private double[] flightHours = new double[5];

    public Pilot(String name, double[] flightHours) {
        this.name = name;
        this.flightHours = Arrays.copyOf(flightHours, flightHours.length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getFlightHours() {
        return Arrays.copyOf(flightHours, flightHours.length);
    }

    public void setFlightHours(double[] flightHours) {
        this.flightHours = Arrays.copyOf(flightHours, flightHours.length);
    }

    public void zmienLiczbeGodzinLotu(int wartosc, int pozycja) {
        if (pozycja > 0 && pozycja <= flightHours.length) {
            this.flightHours[pozycja - 1] = wartosc;
        } else {
            System.out.println("Nieprawidłowa pozycja do zmiany liczby godzin lotu.");
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pilot clonedPilot = (Pilot) super.clone();
        clonedPilot.flightHours = Arrays.copyOf(this.flightHours, this.flightHours.length);
        return clonedPilot;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "name='" + name + '\'' +
                ", flightHours=" + Arrays.toString(flightHours) +
                '}';
    }
}

class TestPilot {
    public static void main(String[] args) throws CloneNotSupportedException {
        double[] tab = {2, 3, 4, 5, 6};
        Pilot p1 = new Pilot("Janusz", tab);
        System.out.println(p1);

        Pilot p2 = (Pilot) p1.clone();
        System.out.println(p2);

        p1.zmienLiczbeGodzinLotu(12, 3);
        System.out.println(p1);
        System.out.println(p2);
    }
}