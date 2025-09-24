<<<<<<< HEAD
import java.util.Scanner;
public class Age {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter age: ");
int age = input.nextInt();

if(age <= 12) {
System.out.println("child");
}
else if (age <= 19 ) {
System.out.println("teen");
}
else if (age <= 59 ) {
System.out.println("adult"); 
}
else {
System.out.print("senior");

   }
  }
=======
import java.util.Scanner;
public class Age {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter age: ");
int age = input.nextInt();

if(age <= 12) {
System.out.println("child");
}
else if (age <= 19 ) {
System.out.println("teen");
}
else if (age <= 59 ) {
System.out.println("adult"); 
}
else {
System.out.print("senior");

   }
  }
>>>>>>> f25639721586c6b4063e8b9bf21a7787ad6ba4ca
}