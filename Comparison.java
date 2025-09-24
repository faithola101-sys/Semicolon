import java.util.Scanner;

public class Comparison { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter number1: ");
int number1 =  input.nextInt();
System.out.print("Enter number2: ");
int number2 =  input.nextInt();
 if (number1 > number2) {
System.out.print(number1); 
} else {
System.out.print(number2);

    }
  }
}