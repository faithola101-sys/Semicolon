import java.util.Scanner;

public class GradeLetter { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter your grade letters from (a-f): ");
String grade =  input.nextLine();

switch(grade) {
case "a":
System.out.print("Pass");
break;

case "b":
System.out.print("Pass");
break;

case "c":
System.out.print("Pass");
break;

case "d":
System.out.print("Pass");
break;

case "f":
System.out.print("Fail");
break;

default:
System.out.print("pick from A to F");
break;

     }
  }
}