package Java_Core.Homework_20_10_22.Number;

public class NumberOfInteger {

    public static void getNumberOfInteger (int a) {
        int digitCount = 0;

        while (a > 0) {
            a /= 10;
            digitCount++;
        }

        System.out.printf("Number of digits is: %d \n", digitCount);
    }

}
