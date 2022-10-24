package Test.Sorts;

public class Random_Sort_2 {

    public static void main(String[] args) {

        int[] arr = {2, -5, 7, -4, 8};
        sort(arr);

    }

    public static void sort (int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }


}
