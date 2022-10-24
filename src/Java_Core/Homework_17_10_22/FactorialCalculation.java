package Java_Core.Homework_17_10_22;

public class FactorialCalculation {

    public static void main(String[] args) {

        //   condition:  (2 * 5! + 3 * 8!) / (6! + 4!)

        int result = (2 * calculateFactorial(5) + 3 * calculateFactorial(8))
                      / (calculateFactorial(6) + calculateFactorial(4));

        System.out.printf("The result is: %d", result);
        System.out.println();
    }


    public static int calculateFactorial (int n) {
        for (int i = n; i > 1 ; i--) {
            n *= i - 1;
        }
        return n;
    }


}
