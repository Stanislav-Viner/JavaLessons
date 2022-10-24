package Java_Core.Homework_17_10_22.Pentagon_Square;

public class TriangleSquare {

    public static double calculateTriangleSquare (double a, double b, double c) {
        double perimeter = (a + b + c) / 2;                                              // find half of perimeter of the triangle
        return Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
    }

}
