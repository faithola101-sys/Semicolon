import java.util.Scanner;

public class TriangleArea {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter x1: ");
double x1 = input.nextDouble();
System.out.print("Enter y1: ");
double y1 = input.nextDouble();

System.out.print("Enter x2: ");
double x2 = input.nextDouble();
System.out.print("Enter y2: ");
double y2 = input.nextDouble();

System.out.print("Enter x3: ");
double x3 = input.nextDouble();
System.out.print("Enter y3: ");
double y3 = input.nextDouble();

double side1 = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
double side2 = Math.sqrt((x3 - x2)*(x3 - x2) + (y3 - y2)*(y3 - y2));
double side3 = Math.sqrt((x1 - x3)*(x1 - x3) + (y1 - y3)*(y1 - y3));

double side = (side1 + side2 + side3) / 2;
System.out.println("Side of a trangle = " + side);

double area = Math.sqrt(side * (side-side1) * (side-side2) * (side-side3));

System.out.println("Area of a trangle = " + area);

    }
}