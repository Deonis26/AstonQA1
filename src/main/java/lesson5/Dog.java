package lesson5;

public class Dog extends Animal {

private static int countDog=0;
    public Dog(String name) {
        super(name);
        countDog++;
    }

    @Override
    void swim(int swim) {
        if (swim <= 10) {
            System.out.println(name + " проплыл " + swim);
        } else {
            System.out.println(name+" утонул !");
        }
    }

    @Override
    void run(int run) {
        if (run < 500) {
            System.out.println(name + " пробежал " + run);
        } else {
            System.out.println(name + " не пробежал! ");
        }
    }
    public static int counterDog() {
        return countDog;
    }
}
