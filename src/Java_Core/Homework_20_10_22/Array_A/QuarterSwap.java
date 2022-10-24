package Java_Core.Homework_20_10_22.Array_A;

public class QuarterSwap {

    public static void getQuarterSwapping (int[] arr) {

        for (int i = 0; i < arr.length / 4; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length / 2 + i];
            arr[arr.length / 2 + i] = temp;
        }

    }

}
