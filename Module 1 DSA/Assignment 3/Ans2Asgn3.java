import java.util.Arrays;

public class Ans2Asgn3 {
    static private void allUniqueQuadruplets(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n < 4) {
            System.out.println("please enter the array length greater than 2");
            return;
        }
        System.out.print("[");
        for(int a=0; a<n; a++) {
            for(int b=a+1; b<n; b++) {
                for(int c=b+1; c<n; c++) {
                    for(int d=c+1; d<n; d++) {
                        if(nums[a] + nums[b] + nums[c] + nums[d] == target) {
                            System.out.print("["+nums[a]+","+nums[b]+","+nums[c]+","+nums[d]+"]");
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        allUniqueQuadruplets(nums, target);
    }
}
