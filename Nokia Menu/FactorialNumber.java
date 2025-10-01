import java.util.Scanner;

public class FactorialNumber {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter any number: ");
int num = input.nextInt();

int factorial = 1;

for (int i = 1; i <= num; i++) {
     factorial = factorial * i; }
     System.out.println(factorial);
   

 }
}