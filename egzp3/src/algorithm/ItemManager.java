package algorithm;

import java.util.ArrayList;

public class ItemManager<T> {
    private ArrayList<T> lista= new ArrayList<>();

    public ArrayList<T> getLista() {
        return lista;
    }

    public void addItem(T item)
    {
        lista.add(item);
    }
    public T getItem(int index)
    {
        return lista.get(index);
    }
    public int getItemCount()
    {
        return lista.size();
    }
}

class TestItem {
    public static void main(String[] args) {
        ItemManager<Integer> lista=new ItemManager<>();
        lista.addItem(2);
        lista.addItem(4);
        lista.addItem(124);
        lista.addItem(41);
        lista.addItem(41);
        System.out.println(lista.getItem(2));
        System.out.println(lista.getItemCount());
    }
}