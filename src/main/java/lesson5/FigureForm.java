package lesson5;

public interface FigureForm {
    double perimeterСalculation();
    double areaCalculation();
    String colorBackground();
    String colorBorder();

    default void print(){
        System.out.println("[ "+perimeterСalculation()+", "+ areaCalculation()+", "+colorBackground()+", "+colorBorder()+"]" );
    }
}
