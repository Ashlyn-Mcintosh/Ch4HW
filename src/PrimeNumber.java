/**
 * @class: PrimeNumber
 * @date: February 27, 2023
 * @version: 6.0
 * description: This program will take in an integer from the user and display if its a prime number
 */

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: "); //User inputs a number
        int number = input.nextInt();
        boolean primeNumber = number > 1; //Flag variable according to textbook

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                primeNumber = false;
            }
        }

        if (primeNumber) {
            System.out.println(number + " is a prime number!");
        } else {
            primeNumber = true;
            System.out.println(number + " is not a prime number!");
        }
    }
}
