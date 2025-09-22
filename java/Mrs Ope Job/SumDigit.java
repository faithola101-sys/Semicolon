import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        // Extract digits using division and modulus
        int digit1 = number % 10;        // last digit
        int digit2 = (number / 10) % 10; // second digit
        int digit3 = (number / 100) % 10; // third digit
        int digit4 = (number / 1000) % 10; // fourth digit (only for 1000)

        int sum = digit1 + digit2 + digit3 + digit4;

        System.out.println("The sum of the digits is " + sum);
    }
}
