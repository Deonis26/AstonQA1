package lesson5;

public class Cat extends Animal {
    private static int counterCat = 0;
    private boolean satiety;
    private int amountOfFoodToSatisfyHunger = 15;

    public Cat(String name) {
        super(name);
        counterCat++;
        satiety = false;
    }

   // @Override
    void swim(int swim) {
        System.out.println(name + " не умеет плавать! ");
    }

    @Override
    void run(int run) {
        if (run < 200) {
            System.out.println(name + " пробежал " + run);
        } else {
            System.out.println(name + " не пробежал дистанцию!");
        }
    }

    public void eatFood(Bowl bowl) {
        if (bowl.getFoodInBowl() >= amountOfFoodToSatisfyHunger) {
            satiety = true;
            bowl.setFoodInBowl(bowl.getFoodInBowl()-amountOfFoodToSatisfyHunger);
        } else {
            System.out.println(" В миске еды не достаточно, добавть еду в миску! ");
        }
    }

    public static int counterCat() {
        System.out.print("Количество созданных котов: ");
        return counterCat;
    }

    @Override
    public String toString() {
        return "кот " +  name + ", сытость: " + satiety;
    }
}
