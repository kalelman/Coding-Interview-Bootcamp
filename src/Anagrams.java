import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Erick Rojas Perez
 * @date January/07/2019
 * @description Cheek to see if two provided strings are Anagrams of each other.
 * One String is an Anagram of other if it uses the same characters in the same quantity.
 * Only consider characters, not spaces or punctuation. Consider capital Letters to be the same as
 * lower case.
 *
 * Examples: anagrams('rail safety', 'fairy tales') --> true
 *
 *
 */
public class Anagrams {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first text to evaluate: ");
        String inputString1 = scanner.nextLine();

        System.out.println("Input the second text to evaluate: ");
        String inputString2 = scanner.nextLine();

        System.out.println("The input Texts are Anagrams?: " + isAnagram(inputString1, inputString2));

    }

    private static boolean isAnagram(String inputString1, String inputString2) {

        String s1 = inputString1.replaceAll("\\s", "");
        String s2 = inputString2.replaceAll("\\s", "");

        boolean status;

        if (s1.length() != s2.length()) {
            status = false;
        } else {

            char[] s1Array = s1.toLowerCase().toCharArray();
            char[] s2Array = s2.toLowerCase().toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            status = Arrays.equals(s1Array, s2Array);

        }

        return status;

    }

}
