/**
 * @class: SumOfDigits
 * @date: February 25, 2023
 * @version: 4.0
 * description: The program takes an integer from the user and displays the sum of all of the digits added together in the integer.
 */
// I had to use java T point for some help because I got stuck
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value:"); //User enters a number of their choosing
        int value = input.nextInt();
        int sum;
        for (sum = 0; value  > 0; value = value/10)
            sum = sum + value % 10;

        System.out.println("The sum of the digits is " + sum);

    }
}