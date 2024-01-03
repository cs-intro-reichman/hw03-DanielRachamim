public class UniqueChars {
    public static void main(String[] args) {
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    public static String uniqueChars(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // Check if the character is not a space or if it has not been added to the result yet
            if (currentChar != ' ' && result.indexOf(currentChar) == -1) {
                result += currentChar;
            } else if (currentChar == ' ') {
                // Space characters are always added to the result
                result += currentChar;
            }
        }

        return result;
    }
}
