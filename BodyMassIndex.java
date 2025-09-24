import java.util.Scanner;

public class BodyMassIndex {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter weight in pounds: ");
double weightPounds = input.nextDouble();
double weightKilograms = weightPounds * 0.45359237;

System.out.print("Enter height in inches: ");
double heightInches = input.nextDouble();
double heightMeters = heightInches * 0.0254;

double bmi = weightKilograms / (heightMeters * heightMeters);
System.out.print("BMI is = " + bmi);


       }
}