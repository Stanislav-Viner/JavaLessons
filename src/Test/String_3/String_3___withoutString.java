package Test.String_3;

public class String_3___withoutString {

    // Given two strings, base and remove, return a version of the base string where all instances of the remove
    // string have been removed (not case sensitive). You may assume that the remove string is length 1 or more.
    // Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

    public static void main(String[] args) {

        String one = "Hello there";
        String teo = "LLo";
        System.out.println(withoutString(one, teo));   // result: "He there";

    }
    public static String withoutString(String base, String remove) {

        StringBuilder str = new StringBuilder();
        int remLeng = remove.length();
        int basLeng = base.length();

        for (int i = 0, k = 0; i < base.length(); i++, k++) {
            if (k <= basLeng - remLeng && base.substring(k, remLeng + k).equalsIgnoreCase(remove)) {
                k += remLeng - 1;
                i += remLeng - 1;
                continue;
            }
            str.append(base.charAt(i));
        }

        return str.toString();
    }
}
