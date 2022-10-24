package Java_Core.Homework_20_10_22.Array_A;

public class OddEvenArrays {

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


    public static int[] getOddArray (int[] arr) {
        int newArrLength = 0;
        for (int k : arr) {
            if (k % 2 != 0) {
                newArrLength++;
            }
        }

        int[] newArr = new int[newArrLength];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                newArr[j] = arr[i];
                j++;
            }
        }

        return newArr;
    }

}
