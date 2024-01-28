package checking;

public class Main {
    public static void main(String[] args) {
        Integer a=5;
        Integer b=5;
        Integer c=null;
        Integer d=null;
        System.out.println(isEqualOrNull(a,b));
        System.out.println(isEqualOrNull("a", "a"));
        System.out.println(isEqualOrNull("a", "b"));
        System.out.println(isEqualOrNull(null, "b"));
        System.out.println(isEqualOrNull(null, null));
    }

    public static <T> boolean isEqualOrNull(T arg1, T arg2){
        if(arg1 == null && arg2 == null){
            return true;
        }
        if(arg1 == null || arg2 == null){
            return false;
        }
        return arg1.equals(arg2);
    }
}
