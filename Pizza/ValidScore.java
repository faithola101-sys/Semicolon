import java.util.Scanner;

public class ValidScore {
    public static void main(String[] args) {
    
     int sum = 0;
     int average = 0;
     Scanner input = new Scanner(System.in);

       for(int i = 1; i <= 10; i++) {
           System.out.print(i + " Enter ten scores btw (1-100): "); 
           int scores = input.nextInt();  
           
              
            if (scores <= 0) {   
                System.out.println("Invalid score");
                continue;
            } 
            else if (scores > 100) { 
                System.out.println("Invalid score");
                continue;
            } 
            else {
                
             }
           
           sum = sum + scores;
           average = sum / 10;
          
 }
         System.out.println(sum);
         System.out.print(average);
 }
}
 