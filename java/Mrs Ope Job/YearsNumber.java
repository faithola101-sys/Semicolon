import java.util.Scanner;

public class YearsNumber {
public static void main(String[] args) { 
Scanner input = new Scanner(System.in);

System.out.print("Enter minutes: ");
long minutes = input.nextLong();

long days = minutes / 1440 ;
long years = days / 365;
long remainingDays = days % 365;  

System.out.printf("%d years,%d days, %d remaningdays%n", years, days, remainingDays);

    }
}