package CH7Arrays;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class MichaelMancinoPersonalityTest {

    public static void main(String[]args)throws IOException {
        //Foundation. does not actually read thru the file or output anything yet. what does work is checking the input and output files.
        Scanner s = new Scanner(checkinput());
        //intitalizing printstream and making sure it prints out everyone on the list
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
    public static File checkonput() throws IOException {//checks for an output file and creates one if needed
        Scanner scan = new Scanner(System.in);
        System.out.print("Output file name:");
        File s = new File(scan.next());
        if(s.createNewFile()){

        }


        return s;
    }
    public static void fillArr(Scanner s,PrintStream prints){
        //Makes an array to store the answers
        char[] answers = new char[70];
        if(s.hasNextLine()){
            //prints out the name of the person who answered
            String name = s.nextLine();
            prints.println(name + ":");
        }
        if(s.hasNextLine()){
            //fills the answer array
            String ss = s.nextLine();
            for(int i = 0; i < ss.length();i++){
                answers[i] = ss.charAt(i);
            }
        }

        count(s,answers,prints);


    }
    public static void count(Scanner s,char[]answers,PrintStream prints){
        //makes two arrays to count the a and b answers for each category of questions
        int[] acount = new int[4];
        int[] bcount = new int[4];
        //fills the two arrays above
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
        //prints the arrays to the output file with proper format
        prints.println(acount[0] + "A-" + bcount[0]+"B" + " " +acount[1] + "A-" + bcount[1]+"B"+" "  +acount[2] + "A-" + bcount[2]+"B"+" " +acount[3] + "A-" + bcount[3]+"B");
        int[]bpercent = cbpercent(acount,bcount);
        //outputs the percent of b answers to the output file
        prints.print(bpercent[0] + "%, " + bpercent[1] + "%, " + bpercent[2] + "%, " + bpercent[3] + "%, "  + "= ");
        checkpersonality(bpercent,prints);



    }
    public static int[] cbpercent(int[]acount,int[]bcount){//calculates the percent of b answers
        int[]bpercent = new int[4];
        for(int i = 0; i<bpercent.length;i++){
            bpercent[i] = (int)(((double)bcount[i]/((double)acount[i]+(double)bcount[i]))*100);
        }
        return bpercent;

    }
    public static void checkpersonality(int[]bpercent,PrintStream prints){
        //checks the personality based on percent of b answers and then outputs the data to the correct file.1
        String peronality = "";
        if(bpercent[0] > 50){
            peronality += "I";
        }
        else if(bpercent[0] < 50){
            peronality+="E";
        }
        else{
            peronality+="X";
        }
        if(bpercent[1] > 50){
            peronality+="N";
        }
        else if(bpercent[1] < 50){
            peronality+="S";
        }
        else{
            peronality+="X";
        }
        if(bpercent[2]>50){
            peronality+="F";
        }
        else if(bpercent[2] < 50){
            peronality+="T";
        }
        else{
            peronality+="X";
        }
        if(bpercent[3] > 50){
            peronality+="P";
        }
        else if(bpercent[3] < 50){
            peronality+="J";
        }
        else{
            peronality+="X";
        }
        prints.print(peronality);
        prints.println();
        prints.println();


    }
}