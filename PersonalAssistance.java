import java.util.Scanner;

public class PersonalAssistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); 

        System.out.print("Enter your mood: ");
        String mood = input.nextLine();

        System.out.print("Enter your guess (number): ");
        int guess = input.nextInt();
        input.nextLine(); 

        System.out.print("Do you want a suggestion? (yes/no): ");
        String suggestionChoice = input.nextLine();

        
        System.out.println("\nHello, " + name + "! Welcome to your personal assistant.");

        
        if (age < 13) {
            System.out.println("You are a young explorer!");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen life is fun, enjoy it!");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Adulting can be challenging, stay strong!");
        } else if (age >= 60) {
            System.out.println("Wisdom looks good on you!");
        }

       
        if (mood.equalsIgnoreCase("happy")) {
            System.out.println("Keep smiling!");
        } else if (mood.equalsIgnoreCase("tired")) {
            System.out.println("Rest well and recharge!");
        } else if (mood.equalsIgnoreCase("sad")) {
            System.out.println("Cheer up! Better days are ahead.");
        } else {
            System.out.println("Stay positive, no matter the mood!");
        }

        
        int secretNumber = 3;
        if (guess == secretNumber) {
            System.out.println("Congratulations! You guessed the secret number!");
        } else {
            System.out.println("Try again next time! (if the secret number is " + secretNumber + ")");
        }

    
        if (suggestionChoice.equalsIgnoreCase("yes")) {
            System.out.println("Here’s a suggestion for you today: Go out and play a sport you like!");
        } else if (suggestionChoice.equalsIgnoreCase("no")) {
            System.out.println("No worries! Have a great day anyway!");
        } else {
            System.out.println("Invalid choice. Please type 'yes' or 'no'.");
        }

    }
}
