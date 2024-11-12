package lesson5;

public class Cat extends Animal{
private static int counterCat =0;
private boolean satiety;
private int bowlOfFood=20;
    public Cat(String name) {
        super(name);
         counterCat++;
         satiety=false;
    }

    @Override
    void swim(int swim) {
        System.out.println(name+ " не умеет плавать! ");
    }

    @Override
    void run(int run) {
        if (run < 200) {
            System.out.println(name + " пробежал " + run);
        } else {
            System.out.println(name+ " не пробежал дистанцию!");
        }
    }
/*    public int addBowlOfFood(int food){
        bowlOfFood=bowlOfFood+food;
        return bowlOfFood;
    }*/

    public static int counterCat() {
        System.out.println("количество созданных котов:"+counterCat);
        return counterCat;
    }
}
