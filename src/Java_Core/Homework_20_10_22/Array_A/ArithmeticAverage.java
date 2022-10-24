package Java_Core.Homework_20_10_22.Array_A;

public class ArithmeticAverage {

    public static void getArithmeticAverage (int[] arr) {
        double count = 0;

        for (int i = arr.length / 2; i < arr.length; i++) {
            count += arr[i];
        }

        System.out.printf("Arithmetic average is: %.2f \n", (count / (arr.length / 2)));
    }

}
