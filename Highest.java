import java.util.Scanner;

public class Highest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get first person's information
        System.out.print("Enter first person's name: ");
        String name1 = input.nextLine();
        System.out.print("Enter first person's score: ");
        int score1 = input.nextInt();
        
        
        // Get second person's information
        System.out.print("Enter second person's name: ");
        String name2 = input.next();
        System.out.print("Enter second person's score: ");
        int score2 = input.nextInt();
        
        
        // Get third person's information
        System.out.print("Enter third person's name: ");
        String name3 = input.next();
        System.out.print("Enter third person's score: ");
        int score3 = input.nextInt();
        
        
        String highestName = name1;
        int highestScore = score1;
        
        if (score2 > highestScore) {
            highestScore = score2;
            highestName = name2;
        }
        if (score3 > highestScore) {
            highestScore = score3;
            highestName = name3;
        }
        
        
        String lowestName = name1;
        int lowestScore = score1;
        
        if (score2 < lowestScore) {
            lowestScore = score2;
            lowestName = name2;
        }
        if (score3 < lowestScore) {
            lowestScore = score3;
            lowestName = name3;
        }
        

        System.out.printf("Highest Score: %d by %s%n", highestScore, highestName);
        System.out.printf("Lowest Score: %d by %s%n", lowestScore, lowestName);
        
        input.close();
}
}