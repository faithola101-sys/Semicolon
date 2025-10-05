public class Factor {

    public static int factor(int num) {
        if (num <= 0) {
            return 0; 
        }
        int count = 0; 

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {   
            result += i;
            }
        }
       return result;
  }

    public static void main(String[] args) {
        int result = factor(10);
        System.out.println(result); 
    }
}
