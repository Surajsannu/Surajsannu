import javax.print.attribute.HashDocAttributeSet;
import java.util.HashSet;

public class Problem2 {
    public static void main(String[] args) {
       int[] nums = {0,0,1,1,1,2,2,3,3,4};
        findDuplicates(nums);
    }

    public  static void  findDuplicates(int[] nums) {
        HashSet<Integer> seen =  new HashSet<>();
        HashSet<Integer> repeated =  new HashSet<>();
        for(int num : nums) {
            if (seen.contains(num)) {
                repeated.add(num);
            }
            seen.add(num);
        }
            System.out.println("The duplicate are :" + repeated);
        }
    }

