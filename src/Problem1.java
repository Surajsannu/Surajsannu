public class Problem1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target  = 9;
        int result  = findPairs(nums,target);
        System.out.println(result);
        //System.out.println("The target sum are:" + findPairs(nums,target));
    }
    public static int findPairs(int[] nums, int target) {
        // using brute force
        // outer loop picks the first element
        for (int i = 0; i < nums.length; i++) {
            // inner loop starts from the second element
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("(" + nums[i] + ", " + nums[j] + ")");

                }
            }

        }

        return target;
    }
}
