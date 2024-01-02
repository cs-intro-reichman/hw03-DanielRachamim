/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Check if the character is not a space or if it has not been added to the result yet
            if (currentChar != ' ' && result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            } else if (currentChar == ' ') {
                // Space characters are always added to the result
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}