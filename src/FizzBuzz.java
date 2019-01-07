/**
 * @author Erick Rojas Perez
 * @date January/07/2019
 * @description Write a program that console logs the numbers from 1 to n.
 * But for multiples of 3 print "Fizz" instead of the number and for the multiples
 * of 5 print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".
 */
public class FizzBuzz {

    public static void main(String args[]) {

        int n = 100;

        for (int i = 1; i < n; i++) {
            if (i%15 == 0)
                System.out.print("FizzBuzz" + " ");
            else if (i%5 == 0)
                System.out.print("Buzz" + " ");
            else if (i%3 == 0)
                System.out.print("Fizz" + " ");
            else
                System.out.print(i + " ");
        }
    }
}
