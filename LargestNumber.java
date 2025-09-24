<<<<<<< HEAD
import java.util.Scanner;
public class LargestNumber {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter first number: ");
int a = input.nextInt();

System.out.print("Enter second number: ");
int b = input.nextInt();

System.out.print("Enter third number: ");
int c = input.nextInt();

if (a > b && a > c) {
System.out.println(a);
}
 else if (b > c && b > a ) {
System.out.println(b); 
}
else {
System.out.println(c); 

      }

   }
=======
import java.util.Scanner;
public class LargestNumber {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter first number: ");
int a = input.nextInt();

System.out.print("Enter second number: ");
int b = input.nextInt();

System.out.print("Enter third number: ");
int c = input.nextInt();

if (a > b && a > c) {
System.out.println(a);
}
 else if (b > c && b > a ) {
System.out.println(b); 
}
else {
System.out.println(c); 

      }

   }
>>>>>>> f25639721586c6b4063e8b9bf21a7787ad6ba4ca
}