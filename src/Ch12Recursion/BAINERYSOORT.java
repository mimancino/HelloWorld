package Ch12Recursion;

public class BAINERYSOORT {
    public static void main(String[] args) {
        int[]oneten = new int[]{1,2,3,4,5,6,7,8,9,10};
        int correct = sortone(oneten,3);
        System.out.println(correct);
    }
    public static int sortone(int[]arr, int guess){
        int max = arr[arr.length-1];
        int min = arr[0];
        int mid = (max-min)/2;
        if(mid > guess){
            int[]half = new int[arr.length/2+1];
            for(int i = 0; i<half.length;i++){
                half[i] = arr[i];
            }
            return sortone(half,guess);
        }
        else if(mid < guess){
            int[]half = new int[arr.length/2+1];
            for(int i = 0; i<half.length;i++){
                half[i] = arr[i+arr.length/2-1];
            }
            return sortone(half,guess);
        }
        else if(mid == guess){
            return guess;
        }
        else if(max < min) {
            return -1;
        }
        else{
            return -1;

        }

    }

}
