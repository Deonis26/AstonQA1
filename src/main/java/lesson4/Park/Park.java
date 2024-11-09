package lesson4.Park;

import java.util.ArrayList;
import java.util.List;

public class Park { //3
    private String name;
    private List<Attraction> attraction;

    public Park(String name) {
        this.name = name;
        this.attraction = new ArrayList<>();
    }

    public void addAtraction(String name, int openingHours, int price) {
        attraction.add(new Attraction(name, openingHours, price));
    }


    public class Attraction {
        private String name;
        private int openingHours;
        private int price;

        public Attraction(String name, int openingHours, int price) {
            this.name = name;
            this.openingHours = openingHours;
            this.price = price;
        }

        @Override
        public String toString() {
            return "атракцион " + name + ", время работы: " + openingHours + ", цена " + price;
        }
    }

    @Override
    public String toString() {
        return name + " " + attraction;
    }
}

