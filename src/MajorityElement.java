import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(MajorityEle(nums));

    }

    public  static int MajorityEle(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length % 2];
    }
}
