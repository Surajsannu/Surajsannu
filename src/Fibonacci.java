public class Fibonacci {
    public static void main(String[] args) {
        int limit = 20;
        System.out.println(" is fibonacci :" + printFibonacci (limit));
    }
    public static boolean printFibonacci(int limit) {
        int a  = 0;
        int b = 1;
        for(int i =0; i< limit; i++){
         int c  = a + b;
            int temp = a;
            a = b;
            b = c;
        }
        return true;
    }
}
