package Test;

public class Test_2 {

    public static void main(String[] args) {

        System.out.println(xyzMiddle("AsxyzBB"));
    }
    public static boolean xyzMiddle(String str) {

        int one = str.length() / 2 - 2;
        int two = str.length() / 2 - 1;

        if (str.length() <= 2)
           return false;

        if (str.length() % 2 == 0) {
            return str.startsWith("xyz", one) || str.startsWith("xyz", two);
        }

        return str.startsWith("xyz", two);

    }
}
