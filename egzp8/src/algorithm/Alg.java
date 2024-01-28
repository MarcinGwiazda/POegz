package algorithm;

import java.util.Iterator;

public class Alg {
    public static void main(String[] args) {

        java.util.List<String> list = java.util.Arrays.asList("Apple", "Banana", "Orange", "Grapes");
        Iterator<String> iterator = list.iterator();

        int indexToFind = 3;
        System.out.println(atIndex(iterator,indexToFind));
    }
    public static <T> T atIndex(Iterator<T> iterator, int index)
    {
        if (index < 0) {
            throw new IllegalArgumentException("Index must be non-negative");
        }

        int currentIndex = 0;
        while (iterator.hasNext()) {
            T currentElement = iterator.next();
            if (currentIndex == index) {
                return currentElement;
            }
            currentIndex++;
        }

        throw new IndexOutOfBoundsException("Index out of bounds");
    }

}
