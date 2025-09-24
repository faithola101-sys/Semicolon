import java.util.Scanner;
public class Square {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter number");
int number = input.nextInt();

int square = Math.pow(number, 2);

System.out.print(square);

  }
}

