package healthcare;

import javax.net.ssl.HostnameVerifier;
import java.util.Objects;

public class Hospital {
    private String name;
    private double capacity;

    public Hospital(String name, double capacity) {
        this.name = name;
        if(this.name==null)
        {
            this.name="";
        }
        this.capacity = capacity;
        if(this.capacity<0)
        {
            this.capacity=50.0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if(this.name==null)
        {
            this.name="";
        }
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
        if(this.capacity<0)
        {
            this.capacity=50.0;
        }
    }

    @Override
    public String toString() {
        if(name.isEmpty())
        {
            return "Hospital: " + "Capacity: "+ capacity + ".";
        }
        return "Hospital: " +
                "Name: " + name + "." +
                " Capacity: " + capacity + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Double.compare(hospital.capacity, capacity) == 0 && Objects.equals(name, hospital.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }
}


