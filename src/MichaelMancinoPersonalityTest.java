import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MichaelMancinoPersonalityTest {

    public static void main(String[]args)throws FileNotFoundException{
        //Foundation. does not actually read thru the file or output anything yet. what does work is checking the input and output files.
        Scanner s = new Scanner(checkinput());
        PrintStream prints = new PrintStream(checkonput());
        while (s.hasNextLine()){
            fillArr(s, prints);
        }
    }
    public static File checkinput(){//checks for an input file and if it exists creates a scanner for the file
        Scanner scan = new Scanner(System.in);
        System.out.print("Input file name:");
        File s = new File(scan.next());
        while(!(s.exists())){
            System.out.println("File does not exist, try again:");
            s = new File(scan.next());
        }


        return s;
    }
    public static File checkonput(){//checks for a output file and if it exists puts it into a printstream
        Scanner scan = new Scanner(System.in);
        System.out.print("Output file name:");
        File s = new File(scan.next());
        while(!(s.exists())){
            System.out.println("File does not exist, try again:");
            s = new File(scan.next());
        }


        return s;
    }
    public static void fillArr(Scanner s,PrintStream prints) throws FileNotFoundException{
        char[] answers = new char[70];
        if(s.hasNextLine()){
            String name = s.nextLine();
        }
        if(s.hasNextLine()){
            String ss = s.nextLine();
            for(int i = 0; i < ss.length();i++){
              answers[i] = ss.charAt(i);
            }
        }
        System.out.println(Arrays.toString(answers));
        count(s,answers);


    }
    public static void count(Scanner s,char[]answers){
        int[] acount = new int[4];
        int[] bcount = new int[4];
        for(int i = 0; i<answers.length;i++){
            if((i+1)%7 == 1){
                if(answers[i] == 'a' || answers[i] == 'A'){
                    acount[0]++;
                }
                else if(answers[i] == 'b' || answers[i] == 'B'){
                    bcount[0]++;
                }
            }
            else if((i+1)%7 == 2 || (i+1) %7 == 3){
                if(answers[i] == 'a' || answers[i] == 'A'){
                    acount[1]++;
                }
                else if(answers[i] == 'b' || answers[i] == 'B'){
                    bcount[1]++;
                }
            }
            else if((i+1)%7 == 4 || (i+1) %7 == 5){
                if(answers[i] == 'a' || answers[i] == 'A'){
                    acount[2]++;
                }
                else if(answers[i] == 'b' || answers[i] == 'B'){
                    bcount[2]++;
                }
            }
            else if((i+1)%7 == 6 || (i+1) %7 == 0){
                if(answers[i] == 'a' || answers[i] == 'A'){
                    acount[3]++;
                }
                else if(answers[i] == 'b' || answers[i] == 'B'){
                    bcount[3]++;
                }
            }

        }
        System.out.println(Arrays.toString(acount));
        System.out.println(Arrays.toString(bcount));
        //output to file xA-xB
        int[]bpercent = cbpercent(acount,bcount);



    }
    public static int[] cbpercent(int[]acount,int[]bcount){
        int[]bpercent = new int[4];
        for(int i = 0; i<bpercent.length;i++){
            bpercent[i] = (bcount[i]/(acount[i]+bcount[i]))*100;
        }
        return bpercent;

    }
    public static void checkpersonality(bpercent){


    }
}
