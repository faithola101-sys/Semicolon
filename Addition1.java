import java.util.Scanner; 
public class Addition1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the first number:");
int firstNumber = input.nextInt();
System.out.print("Enter the Second number:");
int secondNumber = input.nextInt();
int sum = firstNumber + secondNumber;
System.out.print(sum);
      }
}
