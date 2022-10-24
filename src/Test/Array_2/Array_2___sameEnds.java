package Test.Array_2;

public class Array_2___sameEnds {

    public static void main(String[] args) {

        int[] arr = {5, 6, 45, 99, 13, 5, 3};
        int n = 2;
        System.out.println(sameEnds(arr, n));
    }
    public static boolean sameEnds(int[] nums, int len) {

        int count = 0;

        for (int i = 0, j = nums.length - len; i < len; i++, j++) {
            if (nums[i] == nums[j]) {
                count++;
            }
        }

        return count == len;
    }
}
