import java.util.Scanner;

public class DrivingCost {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter drivingDistance = ");
double drivingDistance = input.nextDouble();

System.out.print("Enter milePerGallon = ");
double milePerGallon = input.nextDouble();

System.out.print("Enter pricePerGallon = ");
double pricePerGallon = input.nextDouble();

double drivingCost = (drivingDistance/milePerGallon) * pricePerGallon;

System.out.printf("The drivingCost = %.2f%n" , drivingCost);

    
     
      }
}