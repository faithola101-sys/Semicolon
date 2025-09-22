import java.util.Scanner;

public class MultipleCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 6 == 0 || number % 7 == 0) {
            System.out.println(number + " is a multiple of 6 or 7.");
        } else {
            System.out.println(number + " is not a multiple of 6 or 7.");
        }
    }
}