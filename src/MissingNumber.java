public class MissingNumber {
    public static void main(String[] args) {
        int[] num  = {1,2,4,5,6,7,8};
        int n  = 8;
        System.out.println("Missing element: " +findMissingNumber(num, n));
    }

    public static int findMissingNumber(int[] num,int n) {
        int totalSum  = n*(n+1) /2;
        int arrSum = 0;
        for(int nums  : num){
            arrSum+= nums;
        }

        return totalSum - arrSum;
    }
}
