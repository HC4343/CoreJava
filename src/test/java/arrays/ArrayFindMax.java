package arrays;

public class ArrayFindMax {
    public static void main(String[] args) {
        int[] arr1 = {2,5,8};

        System.out.println(maximum(arr1));
    }
    public static int maximum(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int each :arr) {
            if (each>max){
                max=each;
            }
        }
        return max;
    }
}
