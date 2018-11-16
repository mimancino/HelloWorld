import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
//EXTRA CREDIT IS NOT DONE
public class MichaelMancinoSum {
    public static void main(String[] args) throws FileNotFoundException {
        int MaxDigits = 25;//Class constant, any number that is smaller than the max int value works here. this is the largest number in the file that you are trying to add.
        Scanner scan = new Scanner(new File("sum.txt"));
        int lgline = findlargestline(scan);
        String[] base = new String[MaxDigits + lgline - 1];
        String[] add = new String[MaxDigits + lgline - 1];
        //creates the two arrays used in adding the problems. the total array is not needed until later.
        init(base, add);
    }
    public static int findlargestline(Scanner scan) {
        //finds the largest line(Used to make sure the data doesn't overflow because if all values were 9's and the numbers 25 digits long the program would overflow(algo step 1)
        int lgline = 0;
        int count = 0;
        while (scan.hasNextLine()) {
            Scanner scann = new Scanner(scan.nextLine());
            while (scann.hasNext()) {
                count++;
                scann.next();
            }
            if (count > lgline) {
                lgline = count;
            }
            count = 0;
        }
        return lgline;
    }
    public static void init(String[] base, String[] add) throws FileNotFoundException {
        String[] total = new String[base.length];
        int lines = 0;
        Scanner scanss = new Scanner(new File("sum.txt"));
        int counter = base.length - 1;
        while (scanss.hasNextLine()) {
            //last step in algo-reset arrays when needed
            for (int i = base.length - 1; i >= 0; i--) {
                base[i] = "0";
                add[i] = "0";
                total[i] = "0";

            }
            Scanner scans = new Scanner(scanss.nextLine());//We can assume that there will always be one variable as said in the project so we want to immediately pull said variable.
            String s = scans.next();
            //These if/else statements are elsewhere in the program as well. these serve to stop adding + signs when they are not needed.
            //Step 2 and 3 of algo-use line and token based processing to read out tokens and put them into base/add thru the back

            if(scans.hasNext()) {
                System.out.print(s + " + ");
            }
            else{
                System.out.print(s);
            }
            int len = s.length() - 1;
            //fills base with the values necessary by turning the scanned value into separate chars so they can be put in as individual strings in the array.
            for (int i = len; i >= 0; i--) {
                char c = s.charAt(len - i);
                String cs = Character.toString(c);
                base[counter - i] = cs;
            }
            //if there is not another token it will go straight to printing it out(why the if statement is necessary, we don't want to add 0 randomly.
            if (scans.hasNext()) {
                s = scans.next();
                if(scans.hasNext()) {
                    System.out.print(s + " + ");
                }
                else{
                    System.out.print(s);
                }
                len = s.length() - 1;
                //Does the same thing to add as the loop above.
                for (int i = len; i >= 0; i--) {
                    char c = s.charAt(len - i);
                    String cs = Character.toString(c);
                    add[counter - i] = cs;
                }
            }
            //Checks for two options, as 1 or 2 numbers are special cases due to the 2nd add method not running and base being added to add instead of total.
            addonetwo(total, base, add);
            while (scans.hasNext()) {
                //runs for however many numbers were not added previously but uses total instead of base as two things were already added.
                s = scans.next();
                if(scans.hasNext()) {
                    System.out.print(s + " + ");
                }
                else{
                    System.out.print(s);
                }
                for (int i = add.length - 1; i >= 0; i--) {
                    add[i] = "0";
                }
                len = s.length() - 1;
                //resets and then refills add
                for (int i = len; i >= 0; i--) {
                    char c = s.charAt(len - i);
                    String cs = Character.toString(c);
                    add[counter - i] = cs;


                }
                addthreeplus(total, add);
            }
            //extra step of algo-print the array with no leading zeros and print the amount of lines at the end of the code.
            //lz is the length of the array with the leading zero's removed and test is used as a counter to traverse the array in a while loop.
            //inttest is used to check if there is a 0.
            int lz = total.length;
            int test = total.length-1;
            int inttest = Integer.parseInt(total[total.length-1-test]);
            while(inttest == 0 && lz > 1){
                lz--;
                test--;
                inttest = Integer.parseInt(total[total.length-1-test]);

            }
            //finalarr is total w/o any leading zeros, the loop checks if there is a leading zero and deletes then if there is.
            String[] finalarr = new String[lz];
            for(int i = 0; i<finalarr.length;i++){
                finalarr[finalarr.length-1-i] = total[total.length-1-i];
            }
            String tot = String.join("",finalarr);
            System.out.print(" = " + tot);
            System.out.println();
            counter = base.length - 1;
            lines++;
        }
        System.out.println();
        System.out.println();
        System.out.println("Total lines = " + lines);

    }

    public static void addonetwo(String[] total, String[] base, String[] add) {
        //Adds up base and add and sets the product of addition to total.
        for (int i = base.length - 1; i > 0; i--) {
            int n1 = Integer.parseInt(base[i]);
            int n2 = Integer.parseInt(add[i]);
            n1 += n2;
            if (n1 >= 10) {
                n1 -= 10;
                int n3 = Integer.parseInt(base[i - 1]);
                n3++;
                base[i - 1] = Integer.toString(n3);

            }
            total[i] = Integer.toString(n1);
        }



    }

    public static void addthreeplus(String[] total, String[] add) {
        //adds total and add, as addtwo will always run before this. total will be the previous numbers added and add will be the new addition.
        for (int i = add.length - 1; i > 0; i--) {
            int n1 = Integer.parseInt(total[i]);
            int n2 = Integer.parseInt(add[i]);
            n1 += n2;
            if (n1 >= 10) {
                n1 -= 10;
                int n3 = Integer.parseInt(total[i - 1]);
                n3++;
                total[i - 1] = Integer.toString(n3);

            }
            total[i] = Integer.toString(n1);


        }
    }

}