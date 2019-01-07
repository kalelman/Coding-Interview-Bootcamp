/**
 * @author Erick Rojas Perez</br><br>erick_rojas_perez@hotmail.com</br>
 * @date December/06/2019
 * @description Given a string return a new string with the reversed order of characters
 * Example: Hello --> olleH
 */
public class StringReversal {

    public static void main(String args[]) {

        String word = "Developer";
        String reverseWord = "";

        System.out.println("Original Word: " + word);

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }

        System.out.println("Reversed word: " + reverseWord);
    }

}
