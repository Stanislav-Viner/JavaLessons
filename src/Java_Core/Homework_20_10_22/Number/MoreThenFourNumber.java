package Java_Core.Homework_20_10_22.Number;

public class MoreThenFourNumber {

    public static void isOverFourNumber (int a) {
        int overFour = 0;

        while (a > 0) {
            if (a % 10 > 4) {
                overFour++;
                break;
            }
            a /= 10;
        }

        System.out.printf("Over four number: %b \n", overFour > 0);
    }
}
