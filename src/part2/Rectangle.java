package part2;

public class Rectangle implements GeometricShapes {
    protected int side1;
    protected int side2;
    private String colorFill;
    private String colorBorder;

    Rectangle(int side1, int side2, String colorFill, String colorBorder) {
        this.side1 = side1;
        this.side2 = side2;
        this.colorFill = colorFill;
        this.colorBorder = colorBorder;
    }

    @Override
    public double calculateSquare() {
        return side1*side2;
    }

    @Override
    public void printInfoShape() {
        System.out.println("Прямоугольник: " + '\'' +
                "Периметр = " + calculatePerimetr(side1,side2) + '\'' +
                ", Площадь = " + calculateSquare() + '\'' +
                ", Цвет фона ='" + colorFill + '\'' +
                ", Цвет границ ='" + colorBorder + '\'');
    }
}
