package Ch10ArrayList;

import java.util.ArrayList;

public class IntroToArrayList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        System.out.println(students);
        students.add("Matt");
        System.out.println(students);
        students.add(0,"Jhonny");
        System.out.println(students);
        if(students.contains("Jhonny")){
            students.remove("Jhonny");

        }
        System.out.println(students);
        students.add("Bichael");

    }
}
