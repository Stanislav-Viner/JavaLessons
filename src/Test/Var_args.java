package Test;

public class Var_args {

    public static void main(String[] args) {

        add(5, 6, 7); // result: 5+6+7=18;
    }
    public static void add (int...val) {

        int sum = 0;
        String addition = "";

        for (int i : val) {
            sum += i;
            System.out.print(addition + i);
            addition = "+";
        }

        System.out.print("=" + sum);
    }
}
