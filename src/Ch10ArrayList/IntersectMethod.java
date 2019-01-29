package Ch10ArrayList;

import java.util.ArrayList;

public class IntersectMethod {
    ArrayList<String> l1 = new ArrayList<String>();

    public static void addStars(ArrayList<String> l1){

        for(int i = 1; i < l1.size(); i+=2){
            l1.add(i,"*");



        }
        System.out.println(l1);
    }
}
