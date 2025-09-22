import java.util.Scanner;

    public class CreditLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
         int totala = 0;
         int totalb = 0; 
        
System.out.print("Enter first number: ");
        int a = input.nextInt();

         while (a != 0) {
            
            System.out.print("Enter second number: ");
            int b = input.nextInt();  
       
    int sum = a + b;
    System.out.println(sum +"the sum of ab");   

      totala = totala + a;
      System.out.println(totala + " increment");
      totalb = totalb + b; 
      System.out.println(totalb + " increment");
        
        System.out.print("Enter first number: ");
         a = input.nextInt();
 

}
}
}