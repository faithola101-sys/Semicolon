<<<<<<< HEAD
import java.util.Scanner;
public class Temperature {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter temperature in celsius: ");
int temp = input.nextInt();

if(temp < 0) {
System.out.print("Freezing");
}
else if (temp <= 15) {
System.out.print("Cold");
}
else if (temp <= 25) {
System.out.println("Warm"); 
}
else {
System.out.print("Hot");

   }
  }
=======
import java.util.Scanner;
public class Temperature {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter temperature in celsius: ");
int temp = input.nextInt();

if(temp < 0) {
System.out.print("Freezing");
}
else if (temp <= 15) {
System.out.print("Cold");
}
else if (temp <= 25) {
System.out.println("Warm"); 
}
else {
System.out.print("Hot");

   }
  }
>>>>>>> f25639721586c6b4063e8b9bf21a7787ad6ba4ca
}