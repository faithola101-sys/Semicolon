public class Even {
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
}
