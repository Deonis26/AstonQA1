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
        //  cat2.addBowlOfFood(100);
        System.out.println(Cat.counterCat());

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
