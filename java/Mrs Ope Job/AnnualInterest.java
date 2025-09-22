import java.util.Scanner;

public class AnnualInterest {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter balance: ");
double balance = input.nextDouble();

System.out.print("Enter rate: ");
double rate = input.nextDouble();

double interest = balance * (rate)/1200;
System.out.print("Annual interest is = " + interest);

     }
}
