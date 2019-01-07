import java.util.Scanner;

/**
 * @author Erick Rojas Perez
 * @date January/06/2019
 * @description Given a String, return the characters that is most commonly used in the string
 * Example: maxChar(abccccccd) = "c"
 *
 * Example 2: Write an efficient function to return maximum occurring character in the input string e.g.,
 * if input string is “test” then function should return ‘t’.
 *
 * Algorithm:
 * One obvious approach to solve this problem would be to sort the input string and then traverse through
 * the sorted string to find the character which is occurring maximum number of times.
 * Let us see if we can improve on this. So we will use a technique called ‘Hashing’.
 * In this, when we traverse through the string, we would hash each character into an array of ASCII characters.
 *
 * Typically, ASCII characters are 256, so we use our Hash array size as 256. But if we know that our input string
 * will have characters with value from 0 to 127 only, we can limit Hash array size as 128. Similarly,
 * based on extra info known about input string, the Hash array size can be limited to 26.
 */
public class MaxChars2 {

    static final int ASCII_SIZE = 256;

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the string to evaluate: ");
        String str = scanner.nextLine();
        System.out.println("Max occurring characters is: " + getMaxOccurringChar(str));
    }

    private static char getMaxOccurringChar(String str) {
        //Create an array to keep the count of individual
        // characters and initialize the arrays as 0
        int count [] = new int[ASCII_SIZE];

        //Construct the character count array from the input String
        int len = str.length();

        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        int max = -1; // Initialize max count
        char result = ' '; // Initialize the result

        // Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < len; i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return  result;
    }
}
