package lesson5;

public abstract class Animal {

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
    }

    public static int counter() {
        System.out.println("Количество созданных животных: ");
        return count;
    }
}
