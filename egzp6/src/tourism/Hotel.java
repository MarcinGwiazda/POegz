package tourism;

public class Hotel implements Cloneable {
    private String name;
    private double capacity;

    public Hotel(String name, double capacity) {
        this.name = name;
        if(this.name==null)
        {
            this.name="";
        }
        this.capacity = capacity;
        if(this.capacity<0)
        {
            this.capacity=50;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class testHotelu
{
    public static void main(String[] args) throws CloneNotSupportedException {
        Hotel h1 =new Hotel("Hotel w Olsztynie",-3);
        System.out.println(h1.getCapacity());
        Hotel h2 = new Hotel(null,5);
        System.out.println(h2.getName());
        System.out.println("dsa");
        Hotel h3=(Hotel)h1.clone();
        System.out.println(h3.getName());
        System.out.println(h3.getCapacity());
        h3.setName("Hotel w Gdansku");
        System.out.println(h3.getName());
        System.out.println(h1.getName());
    }
}
