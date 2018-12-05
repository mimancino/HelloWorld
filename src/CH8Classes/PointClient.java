package CH8Classes;

public class PointClient {
    public static void main(String[]args){
        //uses the point class
        PointV1 p1 = new PointV1();
        p1.x = 6;
        p1.y = 3;
        System.out.println("p1: (" + p1.x + ", " + p1.y +")");
        //ideal
        PointV1 p2 = new PointV1();
        p2.x = 7;
        p2.y = 1;
        System.out.println(p1.DFO());


    }

}
