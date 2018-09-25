import java.util.Arrays;
import java.util.Scanner;
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
    Scanner scan = new Scanner(System.in);
    System.out.println("What size array do you want");
    int length = scan.nextInt();
    System.out.println("What range of numbers do you want (enter one number,0-your number)");
    int range = scan.nextInt();
    int [] rando = new int[length];
    for(int i = 0; i < rando.length; i++ ){
            rando[i] = (int)(Math.random() * range);

        }
        System.out.println(Arrays.toString(rando));

    }
}
