package transport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class BusStation {
    private String name;
    private String city;
    private ArrayList<String> buses;

    public BusStation(String name, String city, ArrayList<String> buses) {
        this.name = name;
        this.city = city;
        this.buses = buses;
    }
    public void addBus(String bus)
    {
        buses.add(bus);
    }
    public void removeBus(String bus)
    {
        buses.remove(bus);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<String> getBuses() {
       //return buses;
        return new ArrayList<>(buses);
    }

    public void setBuses(ArrayList<String> buses) {
        //this.buses = buses;
        this.buses = buses!=null ? new ArrayList<>(buses) : new ArrayList<>();
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", buses=" + buses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusStation that = (BusStation) o;
        if(!(Objects.equals(name, that.name))) return false;
        if(!(Objects.equals(city, that.city))) return false;
        return Objects.equals(buses, that.buses);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result=result*31+(city!=null? name.hashCode() : 0);
        result=result*31+(buses!=null? name.hashCode() : 0);
        return result;
    }
}

class InterCityBusStation extends BusStation
{
    private int numberOfPlatforms;

    public InterCityBusStation(String name, String city, ArrayList<String> buses, int numberOfPlatforms) {
        super(name, city, buses);
        this.numberOfPlatforms = numberOfPlatforms;
    }

    public int getNumberOfPlatforms() {
        return numberOfPlatforms;
    }

    public void setNumberOfPlatforms(int numberOfPlatforms) {
        this.numberOfPlatforms = numberOfPlatforms;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", numberOfPlatforms=" + +numberOfPlatforms +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        InterCityBusStation that = (InterCityBusStation) o;
        return this.numberOfPlatforms == that.numberOfPlatforms;
    }

    @Override
    public int hashCode() {
        int hash = super.hashCode();
        hash=31*hash+this.numberOfPlatforms;
        return hash;
    }
}

class TestBusStation
{
    public static void main(String[] args) {
        ArrayList<String> lista= new ArrayList<>(Arrays.asList("122","321","323"));
        ArrayList<String> lista2= new ArrayList<>(Arrays.asList("122","321","32321"));
        BusStation bs1= new BusStation("przystanek1","Olsztyn",lista);
        InterCityBusStation ibs1= new InterCityBusStation("dworzec glowny","Olsztyn",lista2,8);
        bs1.addBus("997");
        bs1.removeBus("122");
        ibs1.addBus("9999");
        ibs1.removeBus("321");
        System.out.println(bs1.getBuses());
        System.out.println(ibs1.getBuses());
        System.out.println(bs1);
        System.out.println(ibs1);
    }
}
