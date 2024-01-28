package utilities;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {
    public static <E> void appendFromEnd(List<? super E> destination, List<? extends E> source) {
        int destIndex = destination.size();
        int sourceIndex = source.size();

        while (sourceIndex > 0) {
            destination.add(destIndex++, source.get(--sourceIndex));
        }
    }

    public static void main(String[] args) {
        // Przykładowe użycie metody appendFromEnd
        List<Object> destinationList = new ArrayList<>();
        List<String> sourceList = List.of("One", "Two", "Three");

        System.out.println("Destination List before appending: " + destinationList);
        System.out.println("Source List: " + sourceList);

        // Wywołanie metody appendFromEnd
        appendFromEnd(destinationList, sourceList);

        System.out.println("Destination List after appending from end: " + destinationList);
    }
}
