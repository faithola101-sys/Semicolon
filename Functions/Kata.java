public class Kata {

        
        public static boolean isEven(int num) {
           if(num % 2 == 0) {
            return true;
        }
           return false;
        }
       
        public static void main(String[] args) {
        boolean result = isEven(4);
        System.out.println(result);
    }


        public static boolean isPrime(int num) {
             if (num <= 1) {
             return false;
          }

              for(int i = 2; i < num; i++) {
              if(num % i == 0) {
              return false;
             }
           }       
        
           return true; 
          }


       public static void main(String[] args) {
       boolean result = isPrime(7);
       System.out.print(result);
     }
   


     public static int sub(int num1, int num2) {

       int sub = num1 - num2;
       return sub;
      }
    
       public static void main(String[] args) {
       int result = sub(7, 3);
       System.out.print(result);
      }

 
      public static float divide(float a, float b) {
      float result = a / b;
      return result;
     }

      public static void main(String[] args) {
      float result = divide(10, 2);
      System.out.print(result);
     }


       public static int factorial(int num) {
          
          if (num < 1) {
          return 0;
          }
    
        int factorial = 1;

          for(int i = 1; i <= num; i++) {
          factorial = factorial * i;
        } 
         return factorial;
        }    

        public static void main(String[] args) {
        int result = factorial(5);
        System.out.print(result);
       }


       public static int square(int num) {
       int square = num * num;
       return square;
       }

      public static void main(String[] args) {
      int result = square(5);
      System.out.print(result);
      }

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

    public static int countFactor(int num) {
        if (num <= 0) {
            return 0; 
        }
        int count = 0; 

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {   
            count++;
            }
         }
          return count;
      }

        public static void main(String[] args) {
        int result = countFactor(10);
        System.out.println(result); 
    }
}

  

