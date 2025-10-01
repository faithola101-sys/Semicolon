import java.util.Scanner;

public class Exponential {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter base number: ");
int base = input.nextInt();

System.out.print("Enter exponential number : ");
int exp = input.nextInt();

int power = 1;
for(int i = 1; i <= exp; i++) {
   power = power * base; }
   System.out.println(power);
 

 }
}