package Java_Core.Homework_20_10_22.Array_A;

public class NewArray {

    public static int[] createArray (int a, int b, int n) {
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * (b - a)) + a);
        }

        return arr;
    }

}
