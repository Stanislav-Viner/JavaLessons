package Test.Array_2;

public class Array_2___sum67 {

    public static void main(String[] args) {

        int[] arr = {6};
        System.out.println(sum67(arr));

    }
    public static int sum67(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 6) {
                count += nums[i];
            }
            else {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 7) {
                        i = j;
                        break;
                    }
                }
            }
        }

        return count;
    }
}
