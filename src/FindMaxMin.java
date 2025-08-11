public class FindMaxMin {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
        int[] result = findMaxMin(arr);
        System.out.println("Min :" + result[0] + " Max :" + result[1]);
    }
    public static int[] findMaxMin(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for(int num : arr){
            if(num < min) {
                min  = num;
            }
            if(num > max) {
                max = num;
            }
        }
        return new int[]{min,max};
    }
}
