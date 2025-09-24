<<<<<<< HEAD
import java.util.Scanner;

public class Attendance { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter attendance in percentage: ");
int percentage =  input.nextInt();

System.out.print("Enter your average score: ");
int averageScore = input.nextInt();

if( percentage >= 75 && averageScore >= 75) {
System.out.print("Eligible"); 
}
else { 
System.out.print("Not Eligible"); 

}
}
=======
import java.util.Scanner;

public class Attendance { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter attendance in percentage: ");
int percentage =  input.nextInt();

System.out.print("Enter your average score: ");
int averageScore = input.nextInt();

if( percentage >= 75 && averageScore >= 75) {
System.out.print("Eligible"); 
}
else { 
System.out.print("Not Eligible"); 

}
}
>>>>>>> f25639721586c6b4063e8b9bf21a7787ad6ba4ca
}