package part2;

public class Triangle implements GeometricShapes {
    protected int side1;
    protected int side2;
    protected int side3;
    private String colorFill;
    private String colorBorder;

    Triangle(int side1, int side2, int side3, String colorFill, String colorBorder) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.colorFill = colorFill;
        this.colorBorder = colorBorder;
    }

    @Override
    public double calculateSquare() {
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    @Override
    public void printInfoShape() {
        System.out.println("Треугольник: " + '\'' +
                "Периметр = " + calculatePerimetr(side1,side2,side3) + '\'' +
                ", Площадь = " + calculateSquare() + '\'' +
                ", Цвет фона ='" + colorFill + '\'' +
                ", Цвет границ ='" + colorBorder + '\'');
    }
}
