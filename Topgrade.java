import java.util.Scanner;

public class Topgrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get first person's information
        System.out.print("Enter first person's name: ");
        String name1 = input.nextLine();
        System.out.print("Enter first person's score: ");
        int score1 = input.nextInt();
        input.nextLine();  // consume leftover newline
        
        
        // Get second person's information
        System.out.print("Enter second person's name: ");
        String name2 = input.nextLine();
        System.out.print("Enter second person's score: ");
        int score2 = input.nextInt();
        input.nextLine();  // consume leftover newline
        
        
        // Get third person's information
        System.out.print("Enter third person's name: ");
        String name3 = input.nextLine();
        System.out.print("Enter third person's score: ");
        int score3 = input.nextInt();
        input.nextLine(); // consume leftover newline

        if (score1 >= score2 && score1 >= score3) {
        System.out.printf("%s the highest scorer with %d points.%n", name1, score1); 
       
      } 
  
     else if (score2 >= score3 && score2 >= score1) {
      System.out.printf("%s the highest scorer with %d points.%n", name2, score2); 

      } 
 
  
      else if (score3 >= score1 && score3 >= score2) {
       System.out.printf("%s the highest scorer with %d points.%n", name3, score3); 
      
       } 
  
    }
 }



