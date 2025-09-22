import java.util.Scanner;

public class EvenOdd { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter number: ");
int number =  input.nextInt();
 
            if (number % 2 == 0) {
            System.out.print("even");
        } else if (number % 2 != 0) {
            System.out.print("odd");
        } else {
        System.out.print("invalid");
    }
  }
}