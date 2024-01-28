package playlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Song {
    public String title;
    public String artist;
    public int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }
}

class DurationComparator implements Comparator<Song>
{

    @Override
    public int compare(Song o1, Song o2) {
        return o2.duration-o1.duration;
    }
}

class ArtistTitleComparator implements Comparator<Song>
{

    @Override
    public int compare(Song o1, Song o2) {
        if(o1.artist.equals(o2.artist))
        {
            return o1.title.compareTo(o2.title);
        }
        return o1.artist.compareTo(o2.artist);
    }
}

class TestSong
{
    public static void main(String[] args) {
        Song s1 = new Song("tytul1","zenek martyniuk",30);
        Song s2 = new Song("tytul2","artysta2",40);
        Song s3 = new Song("abc","artysta3",70);
        Song s4 = new Song("def","artysta3",10);
        Song s5 = new Song("Def","artysta4",50);
        ArrayList<Song> lista= new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));
        System.out.println(lista);
        //lista.sort(new DurationComparator());
        //System.out.println(lista);
        lista.sort(new ArtistTitleComparator());
        System.out.println(lista);
    }
}