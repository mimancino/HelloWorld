import java.util.Arrays;
public class ArrayReversal {
    public static void main(String[]args){
        int[] reverse = {11,42,-5,27,0,89};
        reverse = abbysmethod(reverse);
        System.out.println(Arrays.toString(reverse));
    }
    public static void jhonnysmethod(int[] yeet){


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
