package Ch10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vocabulary1J {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input1 = new Scanner(new File("text1.txt"));
        Scanner input2 = new Scanner(new File("text2.txt"));

        ArrayList<String> list1 = getWords(input1);
        ArrayList<String> list2 = getWords(input2);

//prints both data files of unique words
        System.out.println(list1);
        System.out.println(list2);
    }


    //This methods reads in all the data from an external file
//applies case folding. ArrayList is then sorted to
//eliminate duplicates. The method returns an ArrayList
//of Strings that are unique.
    public static ArrayList<String> getWords(Scanner input) {
//read all words and sort
        ArrayList<String> words = new ArrayList<String>();
        while (input.hasNext()) {
            words.add(input.next().toLowerCase());
        }
        Collections.sort(words);

//eliminate the duplicates in the ArrayList
        ArrayList<String> uniqueWords = new ArrayList<String>();
        if (words.size() > 0) {
            uniqueWords.add(words.get(0));
            for (int i = 1; i < words.size(); i++) {
                if (!words.get(i).equals(words.get(i - 1))) {
                    uniqueWords.add(words.get(i));
                }
            }
        }
        return uniqueWords;
    }
}
