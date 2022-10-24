package Test.Array_2;

public class Array_2___twoTwo {

    public static void main(String[] args) {

        int[] arr1 = {1, 4, 2, 2};
        System.out.println(has77(arr1));
    }
    public static boolean has77(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        if (nums.length == 1 && nums[0] == 2)
            return false;

        if (nums.length < 2)
            return true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 2)
                count2++;
        }

        if (count2 == 0)
            return true;

        OUTER:
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i - 1] ==  2) {
                for (int j = i + 2; j < nums.length; j++) {
                    if (nums[j] == 2 && nums[j - 1] !=  2) {
                        count3++;
                        break OUTER;
                    }
                }
                count1++;
            }
        }

        return count1 > 0 && count3 == 0;
    }
}
