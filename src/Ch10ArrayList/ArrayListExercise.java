package Ch10ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("data.txt"));
        ArrayList<String> Stroong = new ArrayList<String>();
        while(scan.hasNext()){
            Stroong.add(scan.next());

        }
        System.out.println(Stroong);
        int counter = 0;
        for(int i = Stroong.size()-1;i>0;i++){

            counter++;
        }
    }
}
