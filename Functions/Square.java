public class Square {

public static boolean square(int num) {
     if (num < 0){
      return false;
}
      
  for (int i = 1; i < num; i++) {
       if(num % i == 0 && i*i == num) { 
         return true;
      }
     }
     return false;
 }    

public static void main(String[] args) {
boolean result = square(25);
System.out.print(result);

 }
}