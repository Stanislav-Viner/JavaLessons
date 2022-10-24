package Java_Core;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arr = {2, 8, 1, 32, 7, 9};
        System.out.println(Arrays.toString(getEvenArray(arr)));

    }

    public static int[] getEvenArray (int[] arr) {
        int newArrLength = 0;

        for (int k : arr) {
            if (k % 2 == 0) {
                newArrLength++;
            }
        }

        int[] newArr = new int[newArrLength];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArr[j] = arr[i];
                j++;
            }
        }

        return newArr;
    }

}
