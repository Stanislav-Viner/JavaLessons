package Test.Array_2;

import java.util.Arrays;

public class Array_2___tenRun {

    public static void main(String[] args) {

        int[] arr = {2, 10, 3, 4, 20, 5}; // [2, 10, 10, 10, 20, 20]
        sameEnds(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] sameEnds(int[] nums) {

        int isTen = 0;
        int x = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                x = i;
                isTen++;
                break;
            }
        }

        if (isTen == 0)
            return nums;

        for (int i = x; i < nums.length ; i++) {
            if (nums[i] % 10 == 0)
                x = nums[i];
            else
                nums[i] = x;
        }

        return nums;
    }
}
