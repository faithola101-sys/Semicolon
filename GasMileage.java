import java.util.Scanner;
public class GasMileage {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int totalMile = 0;
int totalGallon = 0;
double totalMpg = 0;

System.out.print("Enter mile driven: ");
int mile = input.nextInt();        

while(mile != -1) {


System.out.print("Enter gallon used: ");
int gallon = input.nextInt();

double mpg = (double) mile / gallon;
System.out.println(mpg + " is the mile per gallon for this trip");

totalMile += mile;
totalGallon += gallon;
totalMpg = (double) totalMile / totalGallon;

System.out.println(totalMpg + " is the total mile per gallon");

System.out.print("Enter mile driven(-1 to quit): ");
mile = input.nextInt();
    
      }
   }
}








//Problem statement
//How might we track the usage of fuel for every distance covered

//Pseudocode
//Collect mile driven for a trip 
//condition the mile driven for the trip if is not -1
//Collect gallon used for each trip
//Calculate mile driven per gallon(dividing mile by gallo) 
//Display the result(mile per gallon)
// Since the condition is true
//Collect a fresh mile per gallon
//Total mile per gallon