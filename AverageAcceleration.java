import java.util.Scanner;

public class AverageAcceleration {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter v0: ");
double v0 = input.nextDouble();


System.out.print("Enter v1: ");
double v1 = input.nextDouble();


System.out.print("Enter t: ");
double t = input.nextDouble();

double a = (v1 - v0)/t;
System.out.print("Average acceleration is = " + a);














    
   }
}