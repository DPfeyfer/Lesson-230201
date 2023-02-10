package For_study230201;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public boolean isAdult() {
//        return getAge() > 18;
//    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName() {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //    public void increaseAge(int increment) {
////        if (increment < this.age) {
////            throw new IllegalArgumentException("New age is less then current");
////        }
//        if (increment < 0) {
//            throw new IllegalArgumentException("increment cannot be negative");
//        }
//        this.age = age + increment;
//    }
//
//    public String toString() {
//        return "name " + this.name + " age " + this.age;
//    }


}
