import java.util.Scanner;

/**
 * @author Erick Rojas Perez
 * @date January/06/2019
 * @description Given a String, return the characters that is most commonly used in the string
 * Example: maxChar(abccccccd) = "c"
 */
public class MaxChars {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the word to evaluate: ");
        String word = scanner.nextLine();

        System.out.println("Original word: " + word);
        maximumChars(word);
    }

    private static void maximumChars(String word) {
        int n = word.length();
        int res = -1;

        for (int i = 0; i < n -1; i++) {
            for (int j = i + 1; j < n; j++) {
                res = Math.max(res, Math.abs(j - i - 1));
            }
        }

        System.out.println("The maximum number of characters is: " + res);

    }

}
