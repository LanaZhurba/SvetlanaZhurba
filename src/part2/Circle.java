package part2;

public class Circle implements GeometricShapes{
    protected int radius;
    private String colorFill;
    private String colorBorder;

    Circle(int radius, String colorFill, String colorBorder){
        this.radius = radius;
        this.colorFill = colorFill;
        this.colorBorder = colorBorder;
    }

    @Override
    public double calculateSquare() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printInfoShape() {
        System.out.println("Круг: " + '\'' +
                "Периметр = " + calculatePerimetr(radius) + '\'' +
                ", Площадь = " + calculateSquare() + '\'' +
                ", Цвет фона ='" + colorFill + '\'' +
                ", Цвет границ ='" + colorBorder + '\'');
    }
}
