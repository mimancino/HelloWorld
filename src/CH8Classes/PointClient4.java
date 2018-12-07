package CH8Classes;

public class PointClient4 {
    public static void main(String[]args){


        //uses the point class
        PointV2 p1 = new PointV2();
        p1.x = 6;
        p1.y = 3;
        System.out.println("p1: (" + p1.x + ", " + p1.y +")");
        //ideal
        System.out.println(p1.DFO());
        PointV3 p3 = new PointV3(3,6);//need a constructor, cant do this w/o it
        System.out.println(p3);

        System.out.println(PointV4.geteggBoi());
    }
}
