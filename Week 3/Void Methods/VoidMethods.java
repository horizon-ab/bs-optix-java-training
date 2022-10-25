public class VoidMethods {


    // Double num is number passed in
    public static void print(double num) {

        // Condition
        if (num > 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {

        // Test cases
        print(0.37);
        print(49);
    }
}