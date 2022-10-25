public class Arrays {

    public static void main(String[] args) {
        String[] elements = new String[] {
            "Software",
            "Lucile Randon",
            "Galileo",
            "Destination: Deep Space"
        };

        for (int i = elements.length - 1; i >= 0; i--) {
            System.out.println(elements[i]);
        }
    }
}