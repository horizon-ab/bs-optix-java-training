public class Me {
    private int age;
    private String name;

    public Me(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name; 
    }
    
    public static void main(String[] args) {
        Me bailey = new Me(16, "Bailey");
        System.out.println(bailey.getAge());
        System.out.println(bailey.getName());
    }
}
