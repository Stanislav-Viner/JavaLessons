package Test.Array_2;

import java.util.Arrays;

public class Array_2___evenOdd {

    public static void main(String[] args) {

        int[] arr = {3, 5, 2, 4};
        evenOdd(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[]  evenOdd(int[] nums) {

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        return nums;
    }
}
