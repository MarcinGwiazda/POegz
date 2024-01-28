package transport;

public record BusRoute(String routeNumber,String startLocation,String endLocation) {
    public BusRoute {
        if (routeNumber==null||routeNumber.isEmpty())
        {
            throw new IllegalArgumentException("Route number cannot be null or empty");
        }
    }
    public boolean isLongRoute()
    {
        if(routeNumber.length()>4)
        {
            return true;
        }
        return false;
    }

    public String printDetails() {
        return "routeNumber='" + routeNumber + '\'' +
                ", startLocation='" + startLocation + '\'' +
                ", endLocation='" + endLocation + '\'' +
                '}';
    }
}

class TestBusRoute
{
    public static void main(String[] args) {
        //BusRoute b31= new BusRoute(null,"dsa","dsa");
        BusRoute b1= new BusRoute("1234","dsa","dsa");
        BusRoute b2= new BusRoute("12345","dsa","dsa");
        System.out.println(b1.isLongRoute());
        System.out.println(b2.isLongRoute());
        System.out.println(b1.printDetails());
        System.out.println(b2.printDetails());
    }
}