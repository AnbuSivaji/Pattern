
public class Numeric {

    public static void main(String[] args) {
        String input = "a1b2c3b4";
        StringBuilder output = new StringBuilder();
        for (char ch : input.toCharArray()) {
             if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                
                output.append(ch);
           
            }

        }
        System.out.println("LettersOnly " + " " + output);
        StringBuilder output1 = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                output1.append(ch);
            }
        }
        System.out.println("NumbersOnly " + " " + output1);
    }
}
