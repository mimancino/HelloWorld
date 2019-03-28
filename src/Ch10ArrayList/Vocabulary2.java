
package Ch10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vocabulary2 {//This version removes the non alphabetic characteres
public static void main(String[]args)throws FileNotFoundException {
        Scanner scan1 = new Scanner(new File("moby.txt"));
        Scanner scan2 = new Scanner(new File("hamlet.txt"));
        ArrayList<String> list = getWords(scan1);
        ArrayList<String> list2 = getWords(scan2);
        System.out.println(list);
        System.out.println(list2);
        ArrayList<String> matches = overlap(list ,list2);
        double list1p = percentOverlap(list,matches);
        double list2p = percentOverlap(list2,matches);
        System.out.println(list1p);

        }
        //This method reads the data of an external file and converts it to lowercase and applies casefolding and removes any duplicate words
        public static ArrayList<String> getWords(Scanner scan){
            //Read all words + Sort
            scan.useDelimiter("[^a-zA-Z']+");
            ArrayList<String> words = new ArrayList<>();
            while(scan.hasNext()){
                words.add(scan.next().toLowerCase());
            }
            Collections.sort(words);
            //Eliminate duplicates
            ArrayList<String> uniqueWords = new ArrayList<String>();
            if(words.size() > 0) {
                uniqueWords.add(words.get(0));
            }
                for (int i = 1; i<words.size();i++){
                    if (!words.get(i).equals(words.get(i-1))){
                        uniqueWords.add(words.get(i));

                    }

                }

                    return uniqueWords;
        }
        public static ArrayList<String> overlap(ArrayList<String> l1, ArrayList<String> l2){
        int i1 = 0;
        int i2 = 0;
        ArrayList<String> matches = new ArrayList<String>();
        while((i1 < l1.size()) && (i2 < l2.size())){
            if(l1.get(i1).equals(l2.get(i2))){
                matches.add(l1.get(i1));
                i1++;
                i2++;


            }
            else if(l1.get(i1).compareTo(l2.get(i2) ) <0){
                i1++;
            }
            else{
                i2++;

            }        }
            System.out.println(matches);
            return matches;

        }
        public static double percentOverlap(ArrayList<String> other, ArrayList<String> matches) {
            double percent = 0;




            return ((double)matches.size()/other.size()) *100;
        }

        }
