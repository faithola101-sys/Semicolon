import java.util.Scanner;

public class Divisible { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter your bank account balance: ");
int balance = input.nextInt();

if (balance % 3 == 0 && balance % 5 == 0) {
System.out.print(balance + " is divided by three");
} else { 
System.out.print(balance + " is divided by five"); 
}
//else { 
//System.out.print("divided by both");

     //}
   }
}

