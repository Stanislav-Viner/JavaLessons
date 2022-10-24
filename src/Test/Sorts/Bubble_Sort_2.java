package Test.Sorts;

import java.util.Arrays;

public class Bubble_Sort_2 {

    public static void main(String[] args) {

        int[] arr = {7, 6, 5, 4};
        bubSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubSort(int[] nums) {

        boolean arraySorted = false;

        while (!arraySorted) {
            arraySorted = true;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[i - 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                    arraySorted = false;
                }
            }
        }

    }

}
