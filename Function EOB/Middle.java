public class Middle {

    public static int getMiddleElement(int[] num) {
        int middleIndex = num.length / 2;
        int middleElement = num[middleIndex];
        return middleElement;
    }

    public static void main(String[] args) {
        int[] num = {10, 2, 5, 6, 7, 8, 9};
        int result = getMiddleElement(num);
        System.out.println(result);
    }
}
