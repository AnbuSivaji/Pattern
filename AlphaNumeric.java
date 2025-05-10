public class AlphaNumeric {
    public static void main(String[] args) {
        String input = "a2b3c4d4";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isLetter(currentChar)) {
                output.append(currentChar); // Append the letter
            } else if (Character.isDigit(currentChar)) {
                int count = Character.getNumericValue(currentChar);
                char lastChar = output.charAt(output.length() - 1);
                for (int j = 1; j < count; j++) { // Append (count - 1) times
                    output.append(lastChar);
                }
            }
        }

        System.out.println(output.toString());
    }
}