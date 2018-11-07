import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MichaelMancinoSum {
    public static void main(String[]args) throws FileNotFoundException{
        int MaxDigits = 25;
        Scanner scan = new Scanner(new File("sum.txt"));
        int lgline = findlargestline(scan);
        System.out.println(lgline);
        String [] base = new String[MaxDigits + lgline-1];
        String [] add = new String[MaxDigits + lgline-1];

    }
    public static int findlargestline(Scanner scan){
        //finds the largest line
        int lgline = 0;
        int count = 0;
        while(scan.hasNextLine()){
            Scanner scann = new Scanner(scan.nextLine());
            while(scann.hasNext()){

                count++;
                scann.next();

            }
            if(count > lgline){
                lgline = count;

            }

            count  = 0;


        }


        return lgline;
    }
    public static String[] add(String[] base,String[]add,int MaxDigits){
        String[] total



        return
    }

}
