package Ch9Inheritance;

import CH8Classes.PointV2;
import CH8Classes.PointV3;
import CH8Classes.PointV4;

public class PointClient5 {
    public static void main(String[]args){


        //uses the point class
        PointV2 p1 = new PointV2();
        p1.x = 6;
        p1.y = 3;
        System.out.println("p1: (" + p1.x + ", " + p1.y +")");
        //ideal
        System.out.println(p1.DFO());
        PointV5 p3 = new PointV5(3,6);//need a constructor, cant do this w/o it
        System.out.println(p3);

        System.out.println(PointV5.geteggBoi());
    }
}
