package Test.Array_2;

import java.util.Arrays;

public class Array_2___pre4 {

    public static void main(String[] args) {

        int[] arr = {6, 4, 7};
        System.out.println(Arrays.toString(sum67(arr)));
    }
    public static int[] sum67(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                int[] newArr = new int[i];

                for (int j = i - 1; j >= 0; j--) {
                    newArr[j] = nums[j];
                }

                return newArr;
            }
        }

        return nums;
    }
}
