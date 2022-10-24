package Test.Sorts;

public class Random_Sort_1 {

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2};
        sort(arr);
        for (int i : arr)
            System.out.println(i);
    }
    public static int[] sort (int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int index = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    index = j;
                }
            }

            if (i != index) {
                int x = nums[i];
                nums[i] = min;
                nums[index] = x;
            }
        }

        return nums;
    }
}
