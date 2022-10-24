package Java_Core.Homework_17_10_22.Pentagon_Square;

public class PentagonSquare {

    public static void main(String[] args) {

        double a = 3;
        double b = 4;
        double c = 5;
        double d = 6;
        double e = 7;

        double firstTriangleHypotenuse = HypotenuseLength.calculateHypotenuseLength(a, b);
        double firstTriangleSquare = TriangleSquare.calculateTriangleSquare(a, b, firstTriangleHypotenuse);
        System.out.printf("First triangle square is: %.2f \n", firstTriangleSquare);

        double secondTriangleHypotenuse = HypotenuseLength.calculateHypotenuseLength(c, firstTriangleHypotenuse);
        double secondTriangleSquare = TriangleSquare.calculateTriangleSquare(c, firstTriangleHypotenuse, secondTriangleHypotenuse);
        System.out.printf("Second triangle square is: %.2f \n", secondTriangleSquare);

        double thirdTriangleSquare = TriangleSquare.calculateTriangleSquare(d, e, secondTriangleHypotenuse);
        System.out.printf("Third triangle square is: %.2f \n", thirdTriangleSquare);
        System.out.println();

        double pentagonSquare = firstTriangleSquare + secondTriangleSquare + thirdTriangleSquare;
        System.out.printf("The pentagon square is: %.2f \n", pentagonSquare);
    }

}
