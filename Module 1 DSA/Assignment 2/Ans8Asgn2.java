public class Ans8Asgn2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, -1};
        int k = 3;
        int max = 0;
        int min = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] + k > max) max = nums[i] + k;
            if(nums[i] - k < min) min = nums[i] - k;
        }
        System.out.println(max-min);
    }
}
