package part2;

public class main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4, "Красный", "Белый");
        Circle circle2 = new Circle(32, "Белый", "Красный");
        circle1.printInfoShape();
        circle2.printInfoShape();

        Rectangle rectangle1 = new Rectangle(20,23,"Желтый", "Желтый");
        rectangle1.printInfoShape();

        Triangle triangle1 = new Triangle(32,23,42,"Голубой", "Зеленый");
        triangle1.printInfoShape();
    }
}
