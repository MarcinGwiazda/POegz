package algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Double> set = new HashSet<>();
        set.add(1.0);
        set.add(2.0);
        set.add(-13.0);
        System.out.println(set);
        clearIfContains(set, 2.0);
        System.out.println(set);
        HashSet<Integer> set2= null;
       // clearIfContains(set2,2);
        ArrayList<Integer> lista=new ArrayList<>();
        lista.add(2);
        lista.add(2);
        lista.add(3);
        System.out.println(lista);
        clearIfContains(lista,3);
        System.out.println(lista);

    }

    public static <T> void clearIfContains(Collection<T> kolekcja, T element)
    {
        if(kolekcja==null)
        {
            throw new IllegalArgumentException("kolekcja jest nullem");
        }
        if (kolekcja.contains(element))
        {
            kolekcja.clear();
        }

    }
}