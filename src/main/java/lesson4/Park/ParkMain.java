package lesson4.Park;


public class ParkMain {
    public static void main(String[] args) {
        Park park1 = new Park("парк Мира");
        park1.addAtraction("Веселушки", 12, 3);
        System.out.println(park1);
    }

}

