import java.util.Scanner;

public class Instruction {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter your name: ");
String name = input.nextLine();

System.out.print("Enter your age: ");
int age = input.nextInt();

System.out.print("How do you feel today(happy, sad, excited, tired): ");
String instruction = input.next();

System.out.print("Guess a number between 1 and 10: ");
int number = input.nextInt();

if (number < 10) {
System.out.print("Correct"); } 
else {
System.out.print("Incorrect"); 

    }
  }
}