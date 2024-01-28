package notmod;

import java.util.Objects;

final public class InmutablePoint {
    private final int x;
    private final int y;
    private final int z;

    public InmutablePoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "InmutablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InmutablePoint that = (InmutablePoint) o;
        if (!Objects.equals(x, that.x)) return false;
        if (!Objects.equals(y, that.y)) return false;
        //if (!Objects.equals(z, that.z)) return false;
        //return x == that.x && y == that.y && z == that.z;
        return z == that.z;
    }

    @Override
    public int hashCode() {
        //int result =1;
        //result=31*result+x;
        int result =x;
        result=31*result+y;
        result=31*result+z;
        return result;
    }
}
    class test
    {
        public static void main(String[] args) {
            InmutablePoint p1 = new InmutablePoint(1,2,3);
            InmutablePoint p2 = new InmutablePoint(1,2,3);
            InmutablePoint p3 = new InmutablePoint(2,2,3);
            System.out.println(p2.equals(p3));
            System.out.println(p2.hashCode());
            System.out.println(p3.hashCode());
        }
    }

