<<<<<<< HEAD
import java.util.Scanner;

public class PositiveEven { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter any number: ");
int number = input.nextInt();

if (number < 0) {
  if (number % 2 == 0) {
  System.out.print(number + " positive even"); 
   } else {
   System.out.print(number + " positive odd");
   }
}
else if (number > 0) {
  if (number % 2 == 0) {
  System.out.print(number + " negative even"); 
   } else {
   System.out.print(number + " negative odd");
    }
   }
else {
 System.out.print("invalid");
}
  }
}
=======
import java.util.Scanner;

public class PositiveEven { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter any number: ");
int number = input.nextInt();

if (number > 0 && number % 2 == 0) {
   System.out.println(number + "is a positive even number"); 
} else { 
   System.out.println(number + "is a positive odd number"); 
}
  if (number < 0 && number % 2 == 0) { 
  System.out.println(number + "is a negative even number");
  }
   else { 
          System.out.println(number + "is a negative even number"); 
      }
   }
}
>>>>>>> f25639721586c6b4063e8b9bf21a7787ad6ba4ca
