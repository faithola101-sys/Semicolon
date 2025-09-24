import java.util.Scanner;

public class PersonalAssistant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int secretNumber = 7;

        
        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        
        System.out.println("Hello, " + name + "! Welcome to your personal assistant.");

        
        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
       
 // Age Range
        if (age < 13) {
            System.out.println("You are a young explorer!");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teen life is fun, enjoy it!");
        } else if (age >= 20 && age <= 59) {
            System.out.println("Adulting can be challenging, stay strong!");
        } else {  age >= 60
            System.out.println("Wisdom looks good on you!");
        }

        
        System.out.print("How are you feeling today? (happy/sad/excited/tired): ");
        String mood = scanner.nextLine();

        //Mood Section
        switch (mood) {
            case "happy":
                System.out.println("Keep smiling!");
                break;
            case "sad":
                System.out.println("Cheer up! Tomorrow is a new day.");
                break;
            case "excited":
                System.out.println("Awesome! Enjoy your energy!");
                break;
            case "tired":
                System.out.println("Rest well and recharge!");
                break;
            default:
                System.out.println("That's an interesting mood! Take care of yourself.");
                break;
        }

        System.out.print("Let's play a guessing game! Guess a number between 1 and 10: ");
        int guess = scanner.nextInt();
        scanner.nextLine(); 

        
        if (guess == secretNumber) {
            System.out.println("Wow! You guessed it!");
        } else {
            System.out.println("Try again next time!");
        }

        
        System.out.print("Would you like a suggestion for today? (yes/no): ");
        String wantSuggestion = scanner.nextLine();

        if (wantSuggestion.equals("yes") || wantSuggestion.equals("y")) {
            System.out.print("Here's a suggestion for you today: ");

            
            switch (mood) {
                case "happy":
                    System.out.println("Go out and play a sport you like!");
                    break;
                case "sad":
                    System.out.println("Take a short walk outside and get some fresh air.");
                    break;
                case "excited":
                    System.out.println("Share your excitement by helping someone!");
                    break;
                case "tired":
                    System.out.println("Have a short nap or rest to recharge.");
                    break;
                default:
                    System.out.println("Do something that makes you feel good!");
                    break;
            }
        } else {
            System.out.println("No worries! Have a great day anyway!");
        }

        System.out.println("\nThank you for using your personal assistant, " + name + "!");
        
    }
}