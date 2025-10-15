import java.util.Scanner;

public class Pizza {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

      System.out.println(" PIZZA TYPE");

 String[] pizzaType = {"Sapa Size", "Small Money", "Big Boys","Odogwu"};
        int[] slices = {4, 6, 8, 12};
        int[] pricePerBox = {2500, 2900, 4000, 5200};
 
      for(int i = 0; i < pizzaType.length; i++)  {
      System.out.println((i+1) + " " + pizzaType[i]);
     }
       
        System.out.print("Enter Number Of Guests: ");
        int guestNumber = input.nextInt();
       
        System.out.print("Pick Pizza Type Btw (1-4): ");
        int pick = input.nextInt();

          if (pick == 1) {
          System.out.println(slices[0] + " slices in One box");
          System.out.println(pricePerBox[0] + " price per box");
        }  
          else if (pick == 2) {
          System.out.println(slices[1] + " slices in One box");
          System.out.println(pricePerBox[1] + " price per box");

        }
          else if (pick == 3) {
          System.out.println(slices[2] + " slices in One box");
          System.out.println(pricePerBox[2] + " price per box");

        }
          else if (pick == 4) {
          System.out.println(slices[3] + " slices in One box");
          System.out.println(pricePerBox[3] + " price per box");

        }

        double boxNeeded = (double)guestNumber / slices[pick - 1];
        System.out.println(boxNeeded + " BoxNeeded");
        
        int box = guestNumber % slices[pick - 1];
        double slicesRemaining = (double)box * slices[pick - 1];
        System.out.println(slicesRemaining + " Slice Remaning");
        

        double totalPriceSpent = (double) boxNeeded * pricePerBox[pick - 1];
        System.out.println(totalPriceSpent + " total Price Spent");
}
}
 