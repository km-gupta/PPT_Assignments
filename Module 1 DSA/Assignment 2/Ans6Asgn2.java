public class Ans6Asgn2 {

    private static int targetExists(int[] nums, int target, int h, int l) {
        int mid = l+(h-l)/2;
        //Base condition
        if(nums[mid] == target) {
            return mid;
        } 

        while(l<h) {
            if(nums[mid] > target) {
                return targetExists(nums, target, mid-1, l);
            } else {
                return targetExists(nums, target, h, mid+1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 10;
        int idx = targetExists(nums, target, nums.length, 0);
        System.out.println(idx);        
    }
}
