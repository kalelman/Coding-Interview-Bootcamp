import java.util.Scanner;

/**
 * @author Erick Rojas Perez</br><br>erick_rojas_perez@hotmail.com</br>
 * @date January/06/2019</br>
 * @description Given a String, return if the String is a palindrome
 * or false if it is not. Palindromes are strings that form the same word
 * if it is reversed. Do include spaces and pronunciation in determining
 * if the string is a palindrome
 */
public class Palindromes {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the word to evaluate: ");
        String word = scanner.nextLine();
        checkPalindrome(word);
    }

    private static void checkPalindrome(String word) {
        String reversedWord = new StringBuffer(word).reverse().toString();
        if (word.equals(reversedWord))
            System.out.println("The word is a Palindrome");
        else
            System.out.println("The word is not a Palindrome");
    }

}
