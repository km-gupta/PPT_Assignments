import java.util.Arrays;

public class Ans1Asgn3 {

    static private int sumClosestToTarget(int[] nums, int target) {
        int result = 0;
        int n = nums.length;
        Arrays.sort(nums);
        if(n < 3) {
            System.out.println("please enter the array length greater than 2");
            return 0;
        }
        for(int i=0; i<n; i++) {
            if(nums[i] == target) {
                if(i == 0) {
                    result = nums[i] + nums[i+1] + nums[i+2];
                } else if(i == n-1) {
                    result = nums[i] + nums[i-1] + nums[i-2];
                } else {
                    result = nums[i] + nums[i-1] + nums[i+1];
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4, 5};
        int target = 5;
        int sum = sumClosestToTarget(nums, target);
        System.out.println(sum);
    }    
}
