package Test.Array_2;

import java.util.Arrays;

public class Array_2___notAlone {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2};      // [1, 3, 3, 5, 5, 2]
        int x = 1;
        System.out.println(Arrays.toString(notAlone(arr, x)));
    }

    public static int[] notAlone(int[] nums, int val) {

        if (nums.length < 3)
            return nums;

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i + 1] == val &&
                nums[i] >= nums[i + 2] &&
                nums[i + 1] != nums[i] &&
                nums[i + 1] != nums[i + 2]) {
                    nums[i + 1] = nums[i];
            }
            else if (nums[i + 1] == val &&
                nums[i + 2] >= nums[i] &&
                nums[i + 1] != nums[i] &&
                nums[i + 1] != nums[i + 2]) {
                    nums[i + 1] = nums[i + 2];
            }
        }

        return nums;
    }
}
