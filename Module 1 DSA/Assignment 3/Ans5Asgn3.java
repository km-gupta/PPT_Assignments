public class Ans5Asgn3 {
    
    private static void increaseLastDigitByOne(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum = sum*10 + nums[i];
        }
        sum++;
        int i=nums.length-1;
        while(sum > 0) {
            nums[i--] = sum%10;
            sum /= 10;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        increaseLastDigitByOne(nums);
        for(int ar: nums) {
            System.out.print(ar+" ");
        }
        
    }
    

    
}
