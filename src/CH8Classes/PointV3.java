package CH8Classes;

import java.awt.*;

//no MM since you arent running anything here
//this is just setting point as a concept
public class PointV3 {
    //constructor
    public PointV3(int Initx,int Inity){
        x = Initx;
        y = Inity;
    }
    //default constructor
    public PointV3(){
        x=0;
        y=0;
    }
    //usually shouldnt be public(variables)
    public int x;
    public int y;
    //behaviors(methods)
    public void translate(int dx,int dy){
        x+=dx;
        y+=dy;
    }
    public void setLocation(int newx,int newy){
        x=newx;
        y=newy;
    }
    public double badformula(PointV3 other){
        int dx = x-other.x;
        int dy = y-other.y;
        return  Math.sqrt(dx*dx + dy*dy);

    }
    public double DFO(){
        return Math.sqrt((x*x)+(y*y));


    }
    public String toString(){
        return"(" +x + ", " + y +")";
    }

}
