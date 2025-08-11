public class PrimeNumbers {
    public static void main(String[] args) {
        int n =50;
        printPrimes(n);
    }

    public  static void printPrimes(int n) {
        System.out.println("Prime numbers upto  :" + n);
        for(int i =0; i<=n; i++){
            if(isPrime(i)){
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }

    public  static boolean isPrime(int num) {
        if(num<=1){
            return false;
        }
        for(int i =2; i*i<=num; i++){
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
}
