import java.util.Scanner;

public class FeetMeters {
public static void main(String[] args) { 
Scanner input = new Scanner(System.in);

System.out.print("Enter feetNumber: ");
double feetNumber = input.nextDouble();

double meterNumber = feetNumber * 0.305;

System.out.printf("Number reed in feet is converted to meters = %f%n" , meterNumber);


    }
}