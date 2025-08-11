public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val  = 3;
        System.out.println(ElementsRemoved(nums,val));
    }

    public static int ElementsRemoved(int[] nums, int val) {
        int left =0;
        for(int right =0; right< nums.length; right ++){
            if(nums[right]!= val){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
