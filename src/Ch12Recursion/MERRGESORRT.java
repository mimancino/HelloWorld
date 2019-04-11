package Ch12Recursion;
import java.util.Arrays;

public class MERRGESORRT {
    public static void main(String[] args) {

    }
    public static int[] MergeSort(int[] arr){
        if(arr.length >= 2) {
            int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
            int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
            MergeSort(left);
            MergeSort(right);
            merge(arr,left,right);
        }


    }
    public static int[] merge(int[] arr, int[] left, int[]right) {
        int[] merge = new int[arr.length];
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] < right[j]){
                    merge[i+j] = left[i];
                    i++;
                }
                else{
                    merge[i+j] = right[j];
                    j++;
                }

            }
        }
    }
}
