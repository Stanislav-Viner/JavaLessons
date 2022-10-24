package Test.String_3;

public class String_3___countYZ {

    // Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez"
    // count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if
    // there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char
    // is an alphabetic letter.)

    public static void main(String[] args) {

        String str = "fez day";
        System.out.println(countYZ(str));     // result: 2;
    }
    public static int countYZ(String str) {

            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char iChar = str.charAt(i);
                if ((iChar == 'y' || iChar == 'Y' || iChar == 'z' || iChar == 'Z')
                    && (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))))
                        count++;
            }

            return count;
    }
}
