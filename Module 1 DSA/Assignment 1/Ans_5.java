public class Ans_5 {
    
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int point2 = 0;

        int[] nums2 = {2, 3, 6};

        for(int point1=0; point1<nums1.length; point1++) {
            if((nums1[point1] >= nums2[point2] || nums1[point1] == 0) && point2 < nums2.length) {
                int temp = nums1[point1];
                nums1[point1] = nums2[point2];
                point2++;
                for(int j=point1+1; j<nums1.length-1; j++) {
                    int temp1 = nums1[j];
                    nums1[j] = temp;
                    temp = temp1;
                }
            }
        }
        System.out.print("[");
        for(int ar : nums1) {

            System.out.print(ar+" ");
        }
        System.out.print("]");


    }
}
