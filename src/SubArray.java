import java.util.HashMap;

public class SubArray {
    public static void main(String[] args) {
        int[] array = {1, 4, 20, 3, 10, 5};
        int target = 33;
        System.out.println("Sub array with target :" + SubNumbers(array, target));
    }

    public static boolean SubNumbers(int[] array, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum  =0;
        for(int nums : array){
            sum+= nums;
            //check the prefix sum and current sum is equal to target
            if(map.containsKey(sum - target)){
                return  true;
            }
            //add the current sum to the map
            map.put(sum,1);
    }
        return false;
}
}

