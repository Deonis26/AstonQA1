package lesson3;

public class MainLesson3 {

    public static void main(String[] args) {
        Method mainLesson1 = new Method();
        mainLesson1.printThreeWords();
        mainLesson1.checkSumSign(5, -555);
        mainLesson1.printColor(-200);
        mainLesson1.compareNumbers(10, -5);
        mainLesson1.sumNumber(10, 11);
        mainLesson1.printNumber(-10);
        mainLesson1.checkForSign(-11);
        mainLesson1.printLine("qwerty", 5);
        mainLesson1.yearLeap(3903);
        mainLesson1.massiveChangeling(new int[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 1});
        System.out.println();
        mainLesson1.massive();
        System.out.println();
        mainLesson1.massiveIncrease();
        System.out.println();
        mainLesson1.massiveSumm(10, 11);
    }

}
