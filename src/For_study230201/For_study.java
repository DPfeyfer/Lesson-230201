package For_study230201;

public class For_study {
    public static void main(String[] args) {
        Human denis = new Human("Denis", 39);
        if (denis.getAge() > 18) {
            System.out.println("Go to BAR drink beer");
        } else {
            System.out.println("Sit at home");
        }

    }
}