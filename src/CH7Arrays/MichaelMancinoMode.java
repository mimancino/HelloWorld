package CH7Arrays;

import java.util.Scanner;

public class MichaelMancinoMode {
    public static void main(String[]args){

        int nums = 215151254;
        int max = efficient(nums);
        System.out.println(max);


    }


    public static int efficient(int num){
        //generates an empty array of length 10
        int[] numlist = new int[10];
        int max = 0;
        int mode = 0;
        //adds whatever numbers is found to the correct position in the array(if a 6 is found adds 1 to array[6])
        while (num > 0){
            numlist[num%10]++;
            num/=10;
        }
        //calculates which number of the array is highest and makes the mode that position(if 6 has the highest value mode is six)
        for(int i = 0; i<numlist.length;i++){
            if(numlist[i] > max){
                max = numlist[i];
                mode = i;

            }



        }
        return mode;


    }
}
