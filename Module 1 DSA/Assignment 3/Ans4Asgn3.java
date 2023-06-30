public class Ans4Asgn3 {
    private static int targetIndex(int[] nums, int target, int l, int h) {
        int mid = l+(h-l)/2;
        //Base condition
        if(nums[mid] == target) {
            return mid;
        }
        if(l<h) {
            if(nums[mid] < target) {
                mid = targetIndex(nums, target, mid+1, h);
            } else {
                mid = targetIndex(nums, target, l, mid-1);
            }
        } 
        return mid;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 7, 8, 9};
        int target = 4;
        int idx = targetIndex(nums, target, 0, nums.length-1);
        System.out.println(idx);
    }

    
}
