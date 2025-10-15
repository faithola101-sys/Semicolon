public class Average {
    public static int average(int[] num) {

    int sum = 0;
    int average = 0;

      for(int i = 0; i < num.length; i++) {

       sum = sum + num[i];
     }
       average = sum / num.length;

       return average;
}
   public static void main(String[] args) {
   
   int[] num = {2, 4, 5, 8};
   
   System.out.print(average(num));
}
}