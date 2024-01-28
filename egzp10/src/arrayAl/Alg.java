package arrayAl;

public class Alg {
    public static void main(String[] args) {
        Integer[] tab={4,2,3,4};
        System.out.println(findMaxIndex(tab));
        VideoGame g1= new VideoGame("GTA V","Rockstar Games",(float)5.0);
        VideoGame g2= new VideoGame("EA FC 24","EA SPORTS",(float)4.0);
        VideoGame g3= new VideoGame("Counter Strike 2","Valve",(float)31.5);
        VideoGame[] tab2={g1,g2,g3};
        System.out.println(findMaxIndex(tab2));
    }

    public static <T extends Comparable<T>> int findMaxIndex(T[]tab)
    {
        int maxIndex=0;
        if(tab.length==0||tab==null)
        {
            throw new IllegalArgumentException("Tablica jest pusta lub jest nullem");
        }
        T maxEl=tab[0];
        for(int i =0;i<tab.length;i++)
        {
            if(tab[i].compareTo(maxEl)>0)
            {
                maxIndex=i;
            }
        }
        return maxIndex;
    }
}

class VideoGame implements Comparable<VideoGame>
{
    private String name;
    private String developer;
    private float rating;

    public VideoGame(String name, String developer, float rating) {
        this.name = name;
        this.developer = developer;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getDeveloper() {
        return developer;
    }

    public float getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "name='" + name + '\'' +
                ", developer='" + developer + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(VideoGame o) {
        return Float.compare(this.getRating(),o.getRating());
    }
}