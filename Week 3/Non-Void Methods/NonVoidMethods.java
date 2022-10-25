public class NonVoidMethods {
    
    public static String isFriends(String name) {
        return name + " is friends with Albert";
    }

    public static double timesTwo(double val) {
        return val * 2;
    }

    public static boolean invert(boolean bool) {
        return !bool;
    }
    public static void main(String[] args) {
        System.out.println(isFriends("Bailey"));
        System.out.println(timesTwo(3749));
        System.out.println(invert(true));
    }
}