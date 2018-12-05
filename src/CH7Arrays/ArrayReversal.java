package CH7Arrays;

import java.util.Arrays;
public class ArrayReversal {
    public static void main(String[]args){
        int[] reverse = {11,42,-5,27,0,89};
        reverse = abbysmethod(reverse);
        System.out.println(Arrays.toString(reverse));
        reverse = jhonnysmethod(reverse);
        System.out.println(Arrays.toString(reverse));
    }
    public static int[] jhonnysmethod(int[] yeet){
        for(int i = 0; i<= (yeet.length-1)/2;i++){
            int temp = yeet[i];
            int pos1 = yeet[i];
            int pos2 = yeet[yeet.length-1-i];
            yeet[i] = pos2;
            yeet[yeet.length-1-i] = pos1;
        }
        return yeet;

    }
    public static int[] abbysmethod(int[] yeets){
        //create a temp.var for length
        int[]temp = new int[yeets.length];
        //Copy the contents of the original array into the new array
        for(int i = 0; i <yeets.length;i++){
            //create a temp. int array
            int temps =  yeets[yeets.length-i-1];
            temp[i] = temps;
        }
        yeets = temp;
        return yeets;


    }

}
