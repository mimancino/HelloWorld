package Ch12Recursion;

public class BAINERYSOORTreal {
    public static void main(String[] args) {
        int[]oneten = new int[]{1,2,3,4,5,6,7,8,9,10};
        int correct = goodVer(oneten,7,0,oneten.length-1);
        System.out.println(correct);
    }
    public static int goodVer(int[]arr, int target,int min, int max) {

        if(min > max){
            return -1;

        }
        else {
            int mid = (min+max)/2;
            if (arr[mid] > target) {
                return goodVer(arr, target, min, mid - 1);
            }
            else if (arr[mid] < target) {
                return goodVer(arr, target, mid + 1, max);
            }
            else{
                return mid;
        }
        }


        }
   /* public static int notbad(int[]arr, int target){
        int min = 0;
        int max = arr.length-1;
        while(min<=max){
            int mid = (min+max)/2;
            if(arr[mid]>target){
                max = mid-1;
            }
            else if(arr[mid]<target){
                min = mid+1;
            }
            else{
                return mid;
            }


        }
        return -1;

    }*/
}
