package utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> destinationList = new ArrayList<>();
        List<String> sourceList = List.of("One", "Two", "Three");
        ArrayList<Integer> lista=new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> lista2= new ArrayList<>(Arrays.asList(4,5,6));
        ArrayList<String> lista3= new ArrayList<>(Arrays.asList("c","h","w"));
        ArrayList<String> lista4= new ArrayList<>(Arrays.asList("c","h","w"));
        appendFromEnd(lista,lista2);
        System.out.println();
        appendFromEnd(lista3,lista4);
    }

   public static <E> void appendFromEnd(ArrayList<? super E> destination, ArrayList<? extends E> source) {
       List<E> reversedSource = new ArrayList<>(source);
       Collections.reverse(reversedSource);
       destination.addAll(reversedSource);
       for(int i=0;i<destination.size();i++)
       {
           System.out.print(destination.get(i)+ " ");
       }
   }
}