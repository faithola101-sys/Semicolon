import java.util.Scanner;

public class GuessQuestion {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter your guess(correct/incorrect): ");
String GuessQuestion = input.nextLine();

switch(GuessQuestion) {
case "correct":
System.out.print("Wow you guessed it");
break;

case "incorrect":
System.out.print("Try again next time");
break;

default:
System.out.print("No question");
break;


   }
  }
}