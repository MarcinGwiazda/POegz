package healthcare;

import java.util.Objects;

public class Clinic extends Hospital {
    public double rating;

    public Clinic(String name, double capacity, double rating) {
        super(name, capacity);
        this.rating = rating;
        if(this.rating>5 || this.rating<0)
        {
            this.rating=3.0;
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
        if(this.rating>5 || this.rating<0)
        {
            this.rating=3.0;
        }
    }

    @Override
    public String toString() {
        return "Clinic: " + "Name: " + getName()+ "." + " Capacity: "+getCapacity()+"."+" Rating: " + rating+".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Clinic clinic = (Clinic) o;
        return Double.compare(clinic.rating, rating) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), rating);
    }
}
class testClinic
{
    public static void main(String[] args) {
        Clinic c1= new Clinic("klinika1",-12,6.4);
        System.out.println(c1);
    }
}
