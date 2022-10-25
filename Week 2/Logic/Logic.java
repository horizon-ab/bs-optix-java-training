public class Logic {

    // Logic handler
    public static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= candy * 2 || candy >= tea * 2) {
            return 2;
        } else if (tea >= 5 && candy >= 5) {
            return 1;
        } else {
            return -1;
        }
    }

    // Test cases
    public static void main(String[] args) {
        System.out.println(teaParty(6, 8));
        System.out.println(teaParty(3, 8));
        System.out.println(teaParty(20, 6));
    }
}