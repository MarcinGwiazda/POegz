package finding;

import java.util.HashMap;

public class Alg {
    public static void main(String[] args) {
        HashMap<String,Integer>mapa=new HashMap<>();
        mapa.put("klucz1",5);
        mapa.put("klucz2",7);
        mapa.put("klucz3",8);
        mapa.put("klucz4",13);
        System.out.println(mapa);
        System.out.println(findValueByKey(mapa,"klucz1"));
        System.out.println(findValueByKey(mapa,"klucz8"));
        //System.out.println(findValueByKey(mapa,null));
    }
    public static <K,V> V findValueByKey(HashMap<K,V>map, K key)
    {
        if (key == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if(map.containsKey(key))
        {
            return map.get(key);
        }
        return null;
    }
}