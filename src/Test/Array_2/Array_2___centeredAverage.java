package Test.Array_2;

public class Array_2___centeredAverage {

    public static void main(String[] args) {

        int[] arr = {1, 1, 5, 5, 10, 8, 7};
        System.out.println(centeredAverage(arr));
        // result: 5;
    }
    public static int centeredAverage(int[] nums) {

        int maxValue = nums[0];
        int maxValueIndex = 0;
        int minValue = nums[0];
        int minValueIndex = 0;
        int sumCount = 0;
        int indexCount = 0;

        for (int i = 1; i < nums.length; i++) {
            if (maxValue < nums[i]) {
                maxValue = nums[i];
                maxValueIndex = i;
            }

            if (minValue > nums[i]) {
                minValue = nums[i];
                minValueIndex = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == maxValueIndex || i == minValueIndex) {
                continue;
            }
            sumCount += nums[i];
            indexCount++;
        }

        return sumCount / indexCount;
    }
}
