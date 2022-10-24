package Java_Core.Homework_20_10_22.Array_A;

public class MinMaxValue {

    public static void getMinValue (int[] arr) {
        int minValue = arr[0];
        int minValueIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
                minValueIndex = i;
            }
        }

        System.out.printf("Min value of the array is: %d \n", minValue);
        System.out.printf("Min value index is: %d \n", minValueIndex);
    }


    public static void getMaxValue (int[] arr) {
        int maxValue = arr[0];
        int maxValueIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
                maxValueIndex = i;
            }
        }

        System.out.printf("Max value of the array is: %d \n", maxValue);
        System.out.printf("Max value index is: %d \n", maxValueIndex);
    }

}
