package swap;

public class Main {
    public static void main(String[] args) {
        String[] tab={"apple","banana","cherry"};
        for(String x: tab)
        {
            System.out.print(x+ " ");
        }
        System.out.println();
        swapElements(tab,0,2);
        for(String x: tab)
        {
            System.out.print(x+ " ");
        }

        VideoGame v1= new VideoGame("GTA V","Rockstar Games",(float)5.0);
        VideoGame v2= new VideoGame("EA FC 24","EA Sports",(float)4.0);
        VideoGame v3= new VideoGame("Counter Strike 2","Valve",(float)3.0);
        VideoGame[]gry={v1,v2,v3};
        System.out.println();
        for(VideoGame x: gry)
        {
            System.out.print( x+ " ");
        }
        System.out.println();
        swapElements(gry,1,2);
        for(VideoGame x: gry)
        {
            System.out.print(x+" ");
        }
    }
    public static <T> void swapElements(T[] tab, int index1, int index2)
    {
        T pom=tab[index1];
        tab[index1]=tab[index2];
        tab[index2]=pom;
    }
}

class VideoGame
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
}