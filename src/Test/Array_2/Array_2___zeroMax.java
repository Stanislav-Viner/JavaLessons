package Test.Array_2;

import java.util.Arrays;

public class Array_2___zeroMax {

    public static void main(String[] args) {

        int[] arr = {0, 0,  5, 0, 3};
        zeroMax(arr);
        System.out.println(Arrays.toString(arr));
        // result: 3, 4, 3, 3;
    }
    public static int[] zeroMax(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1, k; j < nums.length; j++) {
                    if (nums[j] % 2 != 0) {
                        k = nums[j];
                        for (int l = j + 1; l < nums.length; l++) {
                            if (nums[l] % 2 != 0 && k < nums[l]) {
                                k = nums[l];
                            }
                        }
                        nums[i] = k;
                        break;
                    }
                }
            }
        }

        return nums;
    }
}
