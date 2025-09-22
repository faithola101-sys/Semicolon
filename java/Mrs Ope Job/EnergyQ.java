import java.util.Scanner;

public class EnergyQ {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter initialTemperature: ");
double initialTemperature = input.nextDouble();

System.out.print("Enter finalTemperature: ");
double finalTemperature = input.nextDouble();

System.out.print("Enter waterWeight: ");
double waterWeight = input.nextDouble();

double energyQ = (finalTemperature - initialTemperature) * waterWeight;
System.out.printf("The energy needed = %f%n ", energyQ);

   }

}