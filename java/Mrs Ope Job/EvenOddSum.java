import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        System.out.print("Enter numbers (end with -1): ");

        int number = input.nextInt();

        while (number != -1) {  // loop until -1 is entered
            if (number % 2 == 0) {
                evenSum += number;  // add to even sum
            } else {
                oddSum += number;   // add to odd sum
            }
            number = input.nextInt();  // read next number
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
