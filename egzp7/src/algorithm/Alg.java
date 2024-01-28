package algorithm;

import java.util.HashMap;
import java.util.Map;

public class Alg {
    public static void main(String[] args) {
        HashMap<String,Integer> mapa=new HashMap<>();
        mapa.put("klucz1",1);
        mapa.put("klucz2",2);
        mapa.put("klucz3",3);
        System.out.println(mapa);
        //System.out.println();
        System.out.println(mapToString(mapa));
    }
    public static <K,V>String mapToString(HashMap<K,V>map)
    {
        StringBuilder result = new StringBuilder();
        for(Map.Entry<K,V> entry: map.entrySet())
        {
            result.append(entry.getKey())
                    .append(":")
                    .append(entry.getValue())
                    .append(", ");
        }

        // Usuwanie ostatniego przecinka i spacji, jeśli mapa nie jest pusta
        if (!map.isEmpty()) {
            result.delete(result.length() - 2, result.length());
        }

        return result.toString();
    }
}