/** String processing exercise 1. */
public class lowercase {
    public static void main(String[] args) {  
            String str = args[0];
            System.out.println(lowerCase(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the upper-case letters are converted to lower-case letters.
     * Non-letter characters are left as is.
     */
    public static String lowerCase(String str) {
         String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // Check if the character is an uppercase letter
            if (currentChar >= 'A' && currentChar <= 'Z') {
                // Convert to lowercase by adding the ASCII difference
                result += (char) (currentChar + ('a' - 'A'));
            } else {
                // If not an uppercase letter, leave the character unchanged
                result += currentChar;
            }
        }

        return result;
    }
}
