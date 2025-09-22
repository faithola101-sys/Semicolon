import java.util.Scanner;

public class FutureInvestmentValue {
public static void main(String[] args) { 
Scanner input = new Scanner(System.in);

System.out.print("Enter investment amount: ");
double investmentAmount = input.nextDouble();

System.out.print("Enter Annual interest rate in percentage: ");
double annualInterestRate = input.nextDouble();

double monthlyInterestRate = annualInterestRate / 12;

System.out.print("Enter number of years: ");
double yearsNumber = input.nextDouble();

double futureInvestmentValue = investmentAmount * Math.pow (1 + monthlyInterestRate, yearsNumber) * 12;
System.out.printf("future investment value = %.2f%n " , futureInvestmentValue);

   }
}


