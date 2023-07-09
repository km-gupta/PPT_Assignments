import java.util.HashMap;

public class Ans4Asgn6 {
    private static int maximumContiguousLength(int[] nums) {
        int ans  = 0;
        for(int i=0;i < nums.length;i++){
            if(nums[i] == 0) nums[i] = -1;
        }
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            Integer prev= map.get(sum);
            if(prev == null){
                map.put(sum,i);
                continue;
            }
            ans = Math.max(ans,i-prev); 
        }
        return ans; 
    }
    public static void main(String[] args) {
        int[] nums = {0, 1};
        int count = maximumContiguousLength(nums); 
        System.out.println(count);
    }
}
