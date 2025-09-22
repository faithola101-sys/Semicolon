import java.util.Scanner;

public class AccountBalance { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter your bank account balance: ");
int balance = input.nextInt();

if (balance < 100) {
System.out.print("Low"); 
}
else if (balance <= 1000) {
System.out.print("Medium"); 
} else {
System.out.print("High");
  
    }
  }
}

