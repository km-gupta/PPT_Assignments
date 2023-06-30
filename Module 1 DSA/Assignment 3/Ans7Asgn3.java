public class Ans7Asgn3 {

    private static void sortestSortedList(int[] nums, int[] range) {
        
        for(int i=0; i<nums.length; i++) {
            if(i == nums.length-1) {
                if(nums[i] != range[1]) {
                    System.out.print("["+(nums[i]+1)+","+range[1]+"]");
                }
            } else if(i == 0) {
                if(range[0] != nums[i]) {
                    System.out.print("["+range[0]+","+(nums[i]-1)+"]");
                }
            } else {
                if(nums[i+1]-nums[i] != 1) {
                    System.out.print("["+(nums[i]+1)+","+(nums[i+1]-1)+"]");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int[] range = {0, 99};
        sortestSortedList(nums, range);
    }

    
}
