package utilities;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMin(1,2,3));
    }

    public static <T extends Comparable<T>>T findMin(T first, T second, T third)
    {
        T min=first;
        if(min.compareTo(second)>0)
        {
            min=second;
        }
        if(min.compareTo(third)>0)
        {
            min=third;
        }
        return min;
    }
}
