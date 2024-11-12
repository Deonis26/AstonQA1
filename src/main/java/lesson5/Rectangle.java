package lesson5;

public class Rectangle implements FigureForm{
    private int wight;
    private  int height;
    private String colorBackground;
    private String colorBorder;

    public Rectangle(int wight, int height, String colorBackground, String colorBorder) {
        this.wight = wight;
        this.height = height;
        this.colorBackground = colorBackground;
        this.colorBorder = colorBorder;
    }

    @Override
    public double perimeterСalculation() {
        return 2*(wight+height);
    }

    @Override
    public double areaCalculation() {
        return wight*height;
    }

    @Override
    public String colorBackground() {
        return colorBackground;
    }

    @Override
    public String colorBorder() {
        return colorBorder;
    }
}
