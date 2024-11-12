package lesson5;

public class Animal {

    protected String name;
    protected static int count = 0;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    void run(int run) {
        System.out.println(name + " пробежал " + run);
    }

    void swim(int swim) {
        // System.out.println(name+" проплыл "+swim);
    }

    public static int counter() {
        //System.out.println(count);
        return count;
    }
}
