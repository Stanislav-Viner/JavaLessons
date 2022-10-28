package Java_Core.Homework_25_10_22;

import java.util.Scanner;

public class Number_from_20_10_22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new number: ");
        int number = scanner.nextInt();

        getNumber(number);
    }

    public static void getNumber (int a) {

        int integerCount = 0;
        int biggerThenFour = 0;
        StringBuilder reverseNumber = new StringBuilder();

        while (a > 0) {

            if (a % 10 > 4) {
                biggerThenFour++;
            }

            reverseNumber.append(a % 10);

            a /= 10;
            integerCount++;
        }

        System.out.printf("Number of integers: %d \n", integerCount);
        System.out.printf("Reverse number: %s \n", reverseNumber);
        System.out.printf("Bigger then four integer: %b \n", biggerThenFour > 0);
    }
    
}
