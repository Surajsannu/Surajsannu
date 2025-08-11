public class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Before moving zeroes: ");
        moveZeroes(nums);
        for(int num : nums) {
            System.out.print(num + " ");
        }
        }
    public static void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[lastNonZeroFoundAt ++] = nums[i];
            }
        }
        // Fill the remaining elements with 0
        while(lastNonZeroFoundAt < nums.length) {
            nums[lastNonZeroFoundAt++] = 0;
        }
    }
}
