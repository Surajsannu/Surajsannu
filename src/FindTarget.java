import java.util.HashSet;

public class FindTarget {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
         findarget(nums, target);
        //System.out.println(result);
    }
    public static  void findarget(int[] nums, int target) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            int complimant = target - num;
            if (seen.contains(complimant)) {
                // if it already seen then print the pair
                System.out.println("The output of the pair is :" + complimant + " :" + num);
            }
            seen.add(num);
        }
    }
}
