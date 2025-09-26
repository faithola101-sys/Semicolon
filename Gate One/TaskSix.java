public class TaskSix {
public static void main(String[] args) {
 
     int num = 10;     
     int k = 1;
      for(int i = 4; i <= num; i = i*2) {
      for(int j = 0; j <= i; j = j+1) {
      k = k * i;

     System.out.println(k);
   }
  }        
 }
}