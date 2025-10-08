import java.util.Scanner;

public class Scores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        int average;
        int evenIndex = 0;
        int even = 0;
        int evenCount = 0;
        int averageEven = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter score " + i + ": ");
            int score = input.nextInt();
            sum += score;
            
            if(score % 2 == 0) {
            even += score;
            evenCount++;
         } 
            if(i % 10 == 0) {
            evenIndex += score;
         }
       }

        average = sum / 10; 
        averageEven = even / evenCount;

        System.out.println("even = " + even);
        System.out.println("averageEven = " + averageEven);
        System.out.println("evenIndex = " + evenIndex);  
        System.out.println("Total = " + sum);
        System.out.println("Average = " + average);
    }
}