package Test.Array_2;

import java.util.Arrays;

public class Array_2___zeroFront {

    public static void main(String[] args) {

        int[] arr = {1, 5, 0, 4, 2, 0};
        zeroFront(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static int[] zeroFront(int[] nums) {

        if (nums.length < 2)
            return nums;

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        return nums;
    }
}
