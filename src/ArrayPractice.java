import java.util.Arrays;
public class ArrayPractice {
    public static void main(String[]args){
        int[] noomberz = new int[5];
        //before populating array
        System.out.println(Arrays.toString(noomberz));
        for(int i = 0; i<5; i++){

            noomberz[i] = i+1;


        }
        //after populating array
        System.out.println(Arrays.toString(noomberz));
        //declare and init.


    }
}
