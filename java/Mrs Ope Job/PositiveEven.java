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
