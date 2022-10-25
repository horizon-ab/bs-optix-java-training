public class While {

    public static void main(String[] args) {
        
        int quotient = 64;

        while (quotient != 1) {
            System.out.println(quotient);
            quotient /= 2;
        }
    }
}