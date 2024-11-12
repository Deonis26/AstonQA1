package lesson5;

public class Circle implements FigureForm {
    private int radius;
    private String colorBackgroung;
    private String colorBorder;

    public Circle(int radius, String colorBackgroung, String colorBorder) {
        this.radius = radius;
        this.colorBackgroung = colorBackgroung;
        this.colorBorder = colorBorder;
    }

    @Override
    public double perimeterСalculation() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double areaCalculation() {
        return 3.14 * radius * radius;
    }

    @Override
    public String colorBackground() {
        return colorBackgroung;
    }

    @Override
    public String colorBorder() {
        return colorBorder;
    }
}
