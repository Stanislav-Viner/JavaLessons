package Java_Core.Homework_20_10_22.Array_A;

import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {

        int a = 5;          // min random value of the array
        int b = 25;         // max random value of the array
        int n = 12;         // array length, n % 4 == 0

        System.out.print("New array: ");
        int[] array_A = NewArray.createArray(a, b, n);
        System.out.println(Arrays.toString(array_A));

        System.out.println();
        MinMaxValue.getMinValue(array_A);

        System.out.println();
        MinMaxValue.getMaxValue(array_A);

        System.out.println();
        ArithmeticAverage.getArithmeticAverage(array_A);

        System.out.println();
        QuarterSwap.getQuarterSwapping(array_A);
        System.out.print("Quarter Swap: ");
        System.out.println(Arrays.toString(array_A));

        int[] array_B = OddEvenArrays.getEvenArray(array_A);
        System.out.print("Even array: ");
        System.out.println(Arrays.toString(array_B));

        int[] array_C = OddEvenArrays.getOddArray(array_A);
        System.out.print("Odd array: ");
        System.out.println(Arrays.toString(array_C));
    }

}
