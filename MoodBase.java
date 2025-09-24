import java.util.Scanner;

public class MoodBase {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Whats the mood base suggestion(happy/sad/excited/tired): ");
String MoodBase = input.nextLine();

if (MoodBase.equals("happy")) {
System.out.print("Go out and play a spot you like");
} 
else if ( MoodBase.equals("sad")) {
System.out.print("Take a short walk outside and get some fresh air"); 
}
else if (MoodBase.equals("excited")) {
System.out.print("Share your excitement by helping someone"); 
}
else {

        }
    }
}
