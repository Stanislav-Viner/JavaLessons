package Java_Core.Homework_20_10_22.Number;

public class ReverseNumber {

    public static void getReverse (int a) {
        System.out.print("Reverse number: ");

        while (a > 0) {
            int temp = a % 10;
            a /= 10;
            System.out.print(temp);
        }

    }

}
