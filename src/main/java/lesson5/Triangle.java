package lesson5;

public class Triangle implements FigureForm {
    private int sideA;
    private int sideB;
    private int sideC;
    private String colorBorder;
    private String colorBackground;

    public Triangle(int sideA, int sideB, int sideC, String colorBorder, String colorBackground) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.colorBorder = colorBorder;
        this.colorBackground = colorBackground;
    }


    @Override
    public double perimeterСalculation() {
        return sideA + sideB + sideC;
    }

    @Override
    public double areaCalculation() {
        return (double) (sideA * sideB) / 2;//при условии того что
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
