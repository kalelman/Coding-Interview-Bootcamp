import java.util.Scanner;

/**
 * @author Erick Rojas Perez</br><br>erick_rojas_perez@hotmail.com</br>
 * @date January/06/2019</br>
 * @description Given an Integer, return an integer that is the reverse ordering of numbers.
 */
public class IntegerReversal {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the Integer number: ");
        int originalNumber = scanner.nextInt();
        System.out.println("The original number is: " + originalNumber);
        String strNumber = String.valueOf(originalNumber);
        reverseInteger(strNumber);

    }

    private static void reverseInteger(String originalNumber) {
        String reversedNumber = "";
        for (int i = originalNumber.length() - 1; i >= 0; i--) {
            reversedNumber += originalNumber.charAt(i);
        }
        System.out.println("The reversed number is: " + reversedNumber);
    }

}
