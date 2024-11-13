package lesson5;

public class Bowl {
    private int foodInBowl;

    public Bowl(int foodInBowl) {
        this.foodInBowl = foodInBowl;
    }
    public int addFoodInBowl(int food){
        foodInBowl=foodInBowl+food;
        return foodInBowl;
    }

    public int getFoodInBowl() {
        return foodInBowl;
    }

    public void setFoodInBowl(int foodInBowl) {
        this.foodInBowl = foodInBowl;
    }
}
