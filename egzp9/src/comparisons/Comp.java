package comparisons;

public class Comp {
    public static void main(String[] args) {
        Integer a=5;
        Integer b=3;
        Integer c=1;
        Integer d=8;
        Integer e=10;
        System.out.println(isFirstLargest(a,b,c));
        System.out.println(isFirstLargest(a,a,c));
        System.out.println(isFirstLargest(e,d,c));
        System.out.println(isFirstLargest(a,d,e));
    }
    public static <T extends Comparable<T>> boolean isFirstLargest(T first, T second, T third)
    {
        if(first.compareTo(second)>0&&first.compareTo(third)>0)
        {
            return true;
        }
        return false;
    }
}