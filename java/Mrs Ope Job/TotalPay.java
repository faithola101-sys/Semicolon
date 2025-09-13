//Hours worked = inputa
//Hourly rate = inputb

//1. Regular pay: inputa x inputb = $800
//2. Overtime pay: (45 - 40) hours x $20/hour x 1.5 = 5 hours x 
//$30/hour = $150
//3. Total pay: $800 + $150 = $950

import java.util.Scanner;

public class TotalPay { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter numbers of working hour: ");
int hours =  input.nextInt();

System.out.print("Enter hourly payment rate for the job: ");
int rate = input.nextInt();

int regularPay = hours * rate;
System.out.println("regularPay");

int overtimePay = (hours - 40) * (rate * 1.5);
System.out.print("overtimePay");

int totalPay = regularPay + overtimePay;
System.out.print("TotalPay");

   }
}


