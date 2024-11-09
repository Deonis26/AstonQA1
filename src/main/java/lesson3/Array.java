package lesson3;

public class Array { //13

    public static void main(String[] args) {

        int n = 5;
        int[][] arr;
        arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i == arr.length - 1 - j) {
                    arr[i][j] = 1;
                } else if (i < j && j < arr.length - 1 - i) {
                    arr[i][j] = (int) (Math.random() * 20);
                } else if (j > i && i > arr.length - 1 - j) {
                    arr[i][j] = (int) (Math.random() * -20);
                } else if (i > j && j > arr.length - 1 - i) {
                    arr[i][j] = (int) (Math.random() * 20);
                } else {
                    arr[i][j] = (int) (Math.random() * -20);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(" " + arr[i][j] + " ");

            }
            System.out.println();
        }

    }

}
