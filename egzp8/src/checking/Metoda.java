package checking;

public class Metoda {
    public static void main(String[] args) {
        Integer a=5;
        Integer b=10;
        Integer c=5;
        Integer d=5;
        Integer e=7;
        System.out.println(containsDuplicates(a,b,c));
        System.out.println(containsDuplicates(a,b,d));
        System.out.println(containsDuplicates(a,b,e));
    }
    public static <T> boolean containsDuplicates(T val1,T val2, T val3)
    {
        if(val1.equals(val2)||val1.equals(val3)|| val2.equals(val3))
        {
            return true;
        }
        return false;
    }
}