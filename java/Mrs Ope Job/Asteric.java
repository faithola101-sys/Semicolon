       public class Asteric {
	public static void main(String[] args) {

		int number = 8;
                int column = 0;
                int row = 0;
    for ( row = 1; row <= number; row++) {
	for ( column = 1; column <= row; column++) {
		 System.out.print("*"); }
            System.out.println();
          }   
     
    for ( row = 1; row <= number; row++) {
	     for ( column = 1; column <= number - row; column++) {
	     System.out.print("*"); }
        System.out.println();
     } 
   }
}
     