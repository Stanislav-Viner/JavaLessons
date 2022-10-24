package Test.Array_2;

import java.util.Arrays;

public class Array_2___post4 {

    public static void main(String[] args) {

        int[] arr = {3, 1, 5};
        System.out.println(Arrays.toString(post4(arr)));
    }
    public static int[] post4(int[] nums) {

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                int[] newArr = new int[nums.length - 1 - i];

                for (int j = i + 1, k = 0; j < nums.length; j++, k++) {
                    newArr[k] = nums[j];
                }

                return newArr;
            }
        }

        return nums;
    }

}
