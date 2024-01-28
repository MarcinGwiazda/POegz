package finding;

public class Alg {
    public static void main(String[] args) {
        Integer[] tab={null,null,2};
        String[] tab2={null,null,null};
        System.out.println(findFirstNonNull(tab));
        System.out.println(findFirstNonNull(tab2));
    }

    public static <T> T findFirstNonNull(T[] tab)
    {
        for (T t : tab) {
            if (t != null) {
                return t;
            }
        }
        return null;
    }
}