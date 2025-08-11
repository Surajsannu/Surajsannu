import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,3,0,4,5,6};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZeros(int[] arr) {
        int Nonzerosindex = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp  = arr[Nonzerosindex];
                arr[Nonzerosindex] = arr[i];
                arr[i] = temp;
                Nonzerosindex++;
            }
        }
    }
}
