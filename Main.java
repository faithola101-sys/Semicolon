import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

System.out.print("Enter the first name: ");
String name1 = input.nextLine();

System.out.print("Enter firstname age: ");
int age1 = input.nextInt();

System.out.print("Enter the second name: ");
String name2 = input.next();

System.out.print("Enter secondname age: ");
int age2 = input.nextInt();

System.out.print("Enter the third name: ");
String name3 = input.next();

System.out.print("Enter thirdname age: ");
int age3 = input.nextInt();

String oldestName = name1;
int oldestAge = age1;

String youngestName = name1;
int youngestAge = age1;

if (age2 < youngestAge) {
youngestAge = age2;
youngestName = name2;
System.out.printf("Youngest so far: %s (%d)%n", youngestName, youngestAge); 
} 
  if (age2 > oldestAge) {
oldestAge = age2;
oldestName = name2;
  System.out.printf("Oldest so far: %s (%d)%n", oldestName, oldestAge); 
}


if (age3 < youngestAge) {
 youngestAge = age3;
 youngestName = name3;
System.out.printf("Youngest so far: %s (%d)%n", youngestName, youngestAge); 
} 
  if (age3 > oldestAge) {
      oldestAge = age3;
      oldestName = name3;
  System.out.printf("Oldest so far: %s (%d)%n", oldestName, oldestAge); 

       }
    }
 }