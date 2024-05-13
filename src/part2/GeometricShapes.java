package part2;


import java.util.SortedMap;

public interface GeometricShapes {
    double calculateSquare();
    void printInfoShape();

    default double calculatePerimetr(int radius) {
        return 2 * Math.PI * radius;
    }

    default double calculatePerimetr(int side1, int side2) {
        return 2 * (side1 + side2);
    }

    default double calculatePerimetr(int side1, int side2, int side3) {
        return side1 + side2 + side3;
    }
}