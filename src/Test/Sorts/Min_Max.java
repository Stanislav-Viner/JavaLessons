package Test.Sorts;

public class Min_Max {

    public static void main(String[] args) {

        int[] arr = {2, 8, 3, 5, 7};
        minMax(arr);
    }

    public static void minMax (int[] nums) {
        int minValue = nums[0];
        int mimValueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (minValue > nums[i]) {
                minValue = nums[i];
                mimValueIndex = i;
            }
        }

        System.out.println(minValue);
        System.out.println(mimValueIndex);

    }


}
