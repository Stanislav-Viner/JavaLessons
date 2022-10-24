package Java_Core.Homework_20_10_22.Number;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("New number: ");
        int number = scanner.nextInt();

        NumberOfInteger.getNumberOfInteger(number);
        MoreThenFourNumber.isOverFourNumber(number);
        ReverseNumber.getReverse(number);
        System.out.println();

    }
}
