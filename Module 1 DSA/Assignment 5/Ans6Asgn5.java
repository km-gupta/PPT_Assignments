import java.util.Arrays;

public class Ans6Asgn5 {
    private static void integerAppearsTwice(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] == nums[i+1]) {
                System.out.print(nums[i++]+" ");
            } 
        }
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        integerAppearsTwice(nums);        
    }
}
