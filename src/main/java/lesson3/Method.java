package lesson3;

public class Method {

    public void printThreeWords() {  //1
        System.out.println("Orange," + '\n' +
                "Banana," + '\n'
                + "Apple.");
    }

    public void checkSumSign(int a, int b) {  //2
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public void printColor(int value) {  //3
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public void compareNumbers(int a, int b) { //4
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    public void sumNumber(int a, int b) { //5
        int sumNumber = a + b;
        if (sumNumber >= 10 && sumNumber <= 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public void printNumber(int number) { //6
        if (number >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }

    public void checkForSign(int number) { //7
        if (number >= 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }

    public void printLine(String text, int number) {//8
        for (int i = 0; i < number; i++) {
            System.out.println(text);
        }
    }

    public void yearLeap(int age) {//9
        boolean leepYear = false;
        if (age % 4 == 0) {
            if (age % 100 == 0 && age % 400 != 0) {
                leepYear = false;
            } else if (age % 400 == 0) {
                leepYear = true;
            }
            leepYear = true;
        }
        System.out.println(leepYear);
    }

    public void massiveChangeling(int[] massive) {//10
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == 0) {
                massive[i] = 1;
            } else {
                massive[i] = 0;
            }
        }
        for (int k : massive) {
            System.out.print(k + " ");
        }
    }

    public void massive() { //11
        int massive[] = new int[100];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = i + 1;
        }
        for (int k : massive) {
            System.out.print(k + " ");
        }
    }

    public void massiveIncrease() { //12

        int[] massive = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < massive.length; i++)
            if (massive[i] < 6) {
                massive[i] = massive[i] * 2;
            }
        for (int k : massive) {
            System.out.print(k + " ");
        }
    }

    public void massiveSumm(int len, int intialValue) { //14
        int massive[] = new int[len];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = intialValue;
        }
        for (int k : massive) {
            System.out.print(k + " ");
        }
    }

}

