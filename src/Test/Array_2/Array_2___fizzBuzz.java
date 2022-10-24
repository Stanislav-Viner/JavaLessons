package Test.Array_2;

import java.util.Arrays;

public class Array_2___fizzBuzz {

    public static void main(String[] args) {

        int a = 1;
        int b = 11;
        System.out.println(Arrays.toString(fizzBuzz(a, b)));
    }
    public static String[] fizzBuzz(int start, int end) {
        String[] arr = new String[end - start];

        for (int i = 0; i < arr.length; i++) {
            int temp = i + start;
            if (temp % 3 == 0 && temp % 5 == 0)
                arr[i] = "FizzBuzz";
            else if (temp % 3 == 0)
                arr[i] = "Fizz";
            else if (temp % 5 == 0)
                arr[i] = "Buzz";
            else
                arr[i] = String.valueOf(temp);
        }

        return arr;
    }
}
