import java.util.Scanner;

public class NumberPounds  {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter a number in pounds: ");
double numberPounds = input.nextDouble();

double numberKilograms = numberPounds * 0.454;
System.out.printf("%fKilograms%n", numberKilograms);

     }
}


//one pounds=0.454kilograms
//new pouns= xkilograms
//xkilograms=newpounds * 0.45