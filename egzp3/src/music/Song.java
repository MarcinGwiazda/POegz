package music;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

class DurationComparator implements Comparator<Song>
{
    @Override
    public int compare(Song o1, Song o2) {
        return o1.duration-o2.duration;
    }
}

class ArtistTitleComparator implements Comparator<Song>
{

    @Override
    public int compare(Song o1, Song o2) {
        int comp = o2.getArtist().compareTo(o1.getArtist());
        if(comp==0)
        {
            return o2.getTitle().compareTo(o1.getTitle());
        }
        return comp;
    }
}

class TestSong
{
    public static void main(String[] args) {
        Song[] tab= new Song[5];
        tab[0] = new Song("Yellow","Coldplay",190);
        tab[1] = new Song("Yellow","Coldplay",180);
        tab[2] = new Song("The Nights","Avicii",200);
        tab[3] = new Song("Levels","Avicii",200);
        tab[4] = new Song("Lose Yourself","Eminem",190);
        for(var x : tab)
        {
            System.out.println(x);
        }
        Arrays.sort(tab,new DurationComparator().thenComparing(new ArtistTitleComparator()));
        System.out.println();
        for(var x : tab)
        {
            System.out.println(x);
        }
    }
}


