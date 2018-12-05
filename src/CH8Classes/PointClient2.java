package CH8Classes;

public class PointClient2 {
    public static void main(String[]args){
        //uses the point class
        PointV2 p1 = new PointV2();
        p1.x = 6;
        p1.y = 3;
        System.out.println("p1: (" + p1.x + ", " + p1.y +")");
        //ideal
        PointV2 p2 = new PointV2();
        p2.x = 7;
        p2.y = 1;
        System.out.println(p1.DFO());
        //Point p3 = new PointV2(3,6);
        System.out.println(p1);

    }
}
