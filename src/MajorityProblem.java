import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MajorityProblem {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element in nums1: " + majorityElement(nums1)); // Output: 3
        System.out.println("Majority Element in nums2: " + majorityElement(nums2)); // Output: 2
    }

    public  static int majorityElement(int[] nums) {
        // create a hashmap
        HashMap<Integer,Integer>map  =  new HashMap<>();
        // count the frequency for each
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0) +1);
        }
        // find the elements having greatr than 2
        int majority  = nums.length /2;
        for(int key : map.keySet()){
            if(map.get(key)>majority){
                return key;
            }
        }
        return -1;
    }
}
