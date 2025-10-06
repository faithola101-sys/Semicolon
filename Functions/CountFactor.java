public class CountFactor {

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
