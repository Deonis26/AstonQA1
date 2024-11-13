package lesson5;

//Создать классы кот, собака с наследованием от класса животное.
//Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина
//препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150);
//'Бобик пробежал 150 м.'
public class Lesson3Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик");
        dog1.run(110);
        dog1.swim(111);
        Cat cat1 = new Cat("Барсик");
        cat1.run(111);
        cat1.swim(111);
        Cat cat2 = new Cat("Муля");
        Dog dog2 = new Dog("Пупс");
        dog1.counter();
        System.out.println(Cat.counterCat());
        System.out.println();
        Bowl bowl = new Bowl(30);
        cat1.eatFood(bowl);
        System.out.println(bowl.getFoodInBowl());
        System.out.println(Dog.counterDog());
        System.out.println(Animal.counter());
        Cat cat[] = new Cat[5];
        cat[0] = cat1;
        cat[1] = cat2;
        cat[2] = new Cat("Филя");
        cat[3] = new Cat("Персик");
        cat[4] = new Cat("Тутси");

        for (int i = 0; i < cat.length; i++) {
            cat[i].eatFood(bowl);
        }
        for (int i = 0; i < cat.length; i++) {
            System.out.println(cat[i]);
        }
        System.out.println(bowl.getFoodInBowl());
        bowl.setFoodInBowl(22);
        System.out.println(bowl.getFoodInBowl());

        System.out.println();
        System.out.println("****************************");
        Rectangle rectangle = new Rectangle(11, 12, "Красный", "Зеленый");
        rectangle.print();
        Triangle triangle = new Triangle(11, 11, 8, "Фиолетовый", "Синий");
        triangle.print();
        Circle circle = new Circle(19, "Желтый", "Зеленый");
        circle.print();
    }
}
