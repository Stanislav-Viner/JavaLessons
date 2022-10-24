package Test.Sorts;

import java.util.Arrays;

public class Bubble_Sort_1 {

    public static void main(String[] args) {

        int[] arr = {6, 4, 7, 2, 5};
        bubSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubSort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }
}
