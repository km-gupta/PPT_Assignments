public class Ans8Asgn5 {
    private static int[] originalArray(int[] changed) {
        int[] original = new int[changed.length/2];
        for(int i=0; i<original.length; i++) {
            original[i] = changed[i];
        }
        return original;
    }
    private static void print1DArray(int[] arr) {
        System.out.print("[ ");
        for(int a: arr) {
            System.out.print(a+" ");
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int[] changed = {1,3,4,2,6,8};
        int[] original = originalArray(changed);
        print1DArray(original);        
    }
}
