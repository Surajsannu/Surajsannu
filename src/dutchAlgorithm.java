import java.util.Arrays;

public class dutchAlgorithm {

    // intput = Input: nums = [-1, 2, 0, -3, 5, 0, -2]
    //moves all negative and zeros than positive num
    //out put : nums = [-1,-2,-3,0,0,2,5]
    public void sortArray(int[] nums){
        // initlise 3 pointers
        int low =0, mid =0, high = nums.length;
        while(mid<=high) {
            if (nums[mid] < 0) {
                swap(nums, low, mid);
                low++;
                mid++;

            }else  if (nums[mid] == 0) {
                mid++;
            } else {
                swap(nums, mid, high) ;
            }
            high--;
        }
        }
        private void swap(int[] nums,int i, int j){
              int temp = nums[i];
              nums[i] = nums[j];
              nums[j] =  temp;
        }

    public static void main(String[] args) {
        dutchAlgorithm algo  =  new dutchAlgorithm();
        int[] nums1 = {-1, 2, 0, -3, 5, 0, -2};
        algo.sortArray(nums1);
        System.out.println(Arrays.toString(nums1));


        int[] nums2 = {0, -1, 1, -2, 2, 0};
 algo.sortArray(nums2);
System.out.println(Arrays.toString(nums2));
    }
        }
