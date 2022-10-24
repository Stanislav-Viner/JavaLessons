package Java_Core.Homework_20_10_22;

public class TrafficLights {

    public static void main(String[] args) {

        int number = 59;
        colorOfLight(number);
    }

    public static void colorOfLight (int a) {
        int minute = a % 10;

        if (minute > 4) {
            minute -= 5;
        }

        if (minute >= 0 && minute < 3) {
            System.out.println("Green light");
        } else {
            System.out.println("Red light");
        }

    }

}
