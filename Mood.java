
import java.util.Scanner;

public class Mood {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("How are you feeling (happy, sad, excited, tired)? ");
String mood = input.nextLine();

switch(mood) {
case "happy": 
         System.out.print("Keep smiling"); 
         break;

case "sad":
System.out.print("Cheer up tomorrow is a new day");
break;

case "excited":
System.out.print("Awesome enjoy your energy"); 
break;

case "tired": 
System.out.print("Rest well and recharge");
break;

default: 
     System.out.print("no mood");

     }
   } 
}

