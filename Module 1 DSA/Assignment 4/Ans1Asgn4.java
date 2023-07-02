import java.util.ArrayList;
import java.util.List;

class Ans1Asgn4{

    private static List<Integer> storedArray(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new ArrayList<Integer>();
        int point1 = 0;
        int point2 = 0;
        int point3 = 0;

        while(point1<arr1.length && point2 < arr2.length && point3 < arr3.length) {
            if(arr1[point1] == arr2[point2] && arr1[point1] == arr3[point3]) {
                result.add(arr1[point1++]);
                point2++;
                point3++;
            } else if (arr1[point1] <= arr2[point2] ) {
                if(arr1[point1] < arr3[point3])
                point1++;
            } else if (arr2[point2] < arr1[point1] && arr2[point2] < arr3[point3]) {
                point2++;
            } else if (arr3[point3] < arr1[point1] && arr3[point3] < arr2[point2]) {
                point3++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};
        System.out.println("print");

        List<Integer> result = storedArray(arr1, arr2, arr3);
        System.out.println("Resultant array: "+result);
    }

    
}