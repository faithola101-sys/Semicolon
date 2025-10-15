public class Testing {
   public static int[] swapArray(int[] age) {
     int temp = age[0];
 
      age[0] = age[age.length -1];
      age[age.length -1] = temp;

     return age;

  }
 

    public static void main(String[] args) {
    int[] age = {10,23,45,6,7,2};
    int[] result = swapArray(age);
    for(int i = 0; i < age.length; i++) {


     System.out.println(result[i]);

   }
  }
 }