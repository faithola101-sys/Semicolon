import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a positive number: ");
int num = input.nextInt();

int prime = 1;

if(num < 2) {
System.out.print("isnt a prime number");
}
 
    Boolean isPrime = true;
for (int i = 2; i <= num; i++) {
        if(num % i == 0) {
        isPrime = false;
        break;
      }
  }
        if (isPrime) {
                System.out.println(num + " is prime");
            } else {
                System.out.println(num + " isn't prime");
            }


}
}