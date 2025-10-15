public class Occurence {

     public static int count(int[]num, int targetted){
         int count = 0;
         for(int i = 0; i < num.length; i++) {
         if(num[i] == targetted) {
          count++;
         }
        }
          return count;
       }
          public static void main(String[] args) {
  
          int[] num = {2,4,5,7,2,3,1,2};
          int targetted = 2;
          System.out.print(count(num, targetted));
        }

      }