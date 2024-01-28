package music;

import java.util.ArrayList;
import java.util.Objects;

public class MusicStore {
    private String name;
    private String city;
    private ArrayList<String> albums;

    public MusicStore(String name, String city, ArrayList<String> albums) {
        this.name = name;
        this.city = city;
        this.albums = albums;
    }

    public void addAlbum(String album)
    {
        albums.add(album);
    }
    public void removeAlbum(String album)
    {
        albums.remove(album);
    }

    @Override
    public String toString() {
        return "MusicStore{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", albums=" + albums +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<String> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<String> albums) {
        this.albums = albums;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicStore that = (MusicStore) o;
        if(!Objects.equals(name, that.name)) return false;
        if(!Objects.equals(city, that.city)) return false;
        return Objects.equals(albums, that.albums);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (albums != null ? albums.hashCode() : 0);
        return result;
    }
}

class VinylStore extends MusicStore
{
    private int numberOfVinyls;

    public VinylStore(String name, String city, ArrayList<String> albums, int numberOfVinyls) {
        super(name, city, albums);
        this.numberOfVinyls = numberOfVinyls;
    }

    public int getNumberOfVinyls() {
        return numberOfVinyls;
    }

    @Override
    public String toString() {
        return super.toString()+"VinylStore{" +
                "numberOfVinyls=" + numberOfVinyls +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        VinylStore that = (VinylStore) o;
        return this.numberOfVinyls == that.numberOfVinyls;
    }

    @Override
    public int hashCode() {
        int hash= super.hashCode();
        hash=31*hash+this.numberOfVinyls;
        return hash;
    }
}

class TestMusicStore {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        lista.add("Album1");
        lista.add("Album2");
        lista2.add("Album2");
        lista2.add("Album2");
        MusicStore ms= new MusicStore("Sklep muzyczny","Olsztyn",lista);
        VinylStore vs = new VinylStore("Sklep vinylowy","Warszawa",lista2,20);
        ms.addAlbum("Album3");
        ms.removeAlbum("Album1");
        vs.addAlbum("Album4");
        vs.removeAlbum("Album2");
        System.out.println(ms);
        System.out.println(vs);
    }
}