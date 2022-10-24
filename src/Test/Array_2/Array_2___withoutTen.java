package Test.Array_2;

import java.util.Arrays;

public class Array_2___withoutTen {

    public static void main(String[] args) {

        int[] arr = {1, 10, 10, 2, 10};
        withoutTen(arr);
        System.out.println(Arrays.toString(arr));
        // result: [1, 2, 0, 0];

    }

    public static int[] withoutTen(int[] nums) {

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == 10) {
                nums[i] = 0;
            }

            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        return nums;
    }
}
