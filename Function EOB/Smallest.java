public class Testing {
public static int smallest(int[] num) {

int smallest = 0;
int largest = 0;

    for(int i = 0; i < num.length; i++) {
    
    smallest = num[0];

       if (num[i] < smallest) {
       
        smallest = num[i];
      }
  }
  
   return smallest;
}

public static void main(String[] args) {

int[] num = {3,4,5,6,7};
System.out.print(smallest(num));

 }
}