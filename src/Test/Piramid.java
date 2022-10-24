package Test;

public class Piramid {

    public static void main(String[] args) {

        int x = 8;
        int value = 4;
        piramid(x, value);

        // result:
        //    8
        //   88
        //  888
        // 8888
    }
    public static void piramid (int a, int val) {

        for (int i = 0; i < val; i++) {

            for (int j = 0, k = i + 1; j < val; j++, k++) {
                if (k < val)
                    System.out.print(" ");
                else
                    System.out.print(a);
            }

            System.out.println();
        }
    }
}
