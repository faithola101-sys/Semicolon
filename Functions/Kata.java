public class Kata {

   
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

   
    public static int sub(int num1, int num2) {
        int sub = num1 - num2;
        return sub;
    }

   
    public static float divide(float a, float b) {
        float result = a / b;
        return result;
    }

  
    public static int factorial(int num) {
        if (num < 1) {
            return 0;
        }

        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

 
    public static int square(int num) {
        int square = num * num;
        return square;
    }


    public static boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }

        for (int i = 1; i < num; i++) {
            if (num % i == 0 && i * i == num) {
                return true;
            }
        }
        return false;
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

        boolean resultEven = isEven(4);
        System.out.println(resultEven);

        boolean resultPrime = isPrime(7);
        System.out.println(resultPrime);

        int resultSub = sub(7, 3);
        System.out.println(resultSub);

        float resultDiv = divide(10, 2);
        System.out.println(resultDiv);

        int resultFactorial = factorial(5);
        System.out.println(resultFactorial);

        int resultSquare = square(5);
        System.out.println(resultSquare);

        boolean resultPerfectSquare = isPerfectSquare(25);
        System.out.println(resultPerfectSquare);

        int resultFactorCount = countFactor(10);
        System.out.println(resultFactorCount);
    }
}
