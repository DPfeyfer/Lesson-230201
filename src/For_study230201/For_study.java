package For_study230201;

public class For_study {
    public static void main(String[] args) {
        HumanService humanService = new HumanService();
        Human denis = new Human("Denis", 39);
        if (HumanService.isAdult(denis)) {
            System.out.println("Go to BAR drink beer");
        } else {
            System.out.println("Sit at home");
        }
//        denis.increaseAge(1);
//        System.out.println(denis);

    }
}