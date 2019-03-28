package Ch9Inheritance;

//no MM since you arent running anything here
//this is just setting point as a concept
public class PointV5 {
    private int x;
    private int y;
    private static int eggBoi;//object counter
    //constructor
    public PointV5(int Initx, int Inity){
        eggBoi++;
        x = Initx;
        y = Inity;
    }
    //default constructor
    public PointV5(){
        eggBoi++;
        x=0;
        y=0;
    }
    public static int geteggBoi(){
        return eggBoi;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    //behaviors(methods)
    public void translate(int dx,int dy){
        x+=dx;
        y+=dy;
    }
    public void setLocation(int x,int y){
        this.x=x;
        this.y=y;
    }
    public double badformula(PointV5 other){
        int dx = x-other.x;
        int dy = y-other.y;
        return  Math.sqrt(dx*dx + dy*dy);

    }
    //.this lets you refer to the object state field
    public double DFO(){
        return Math.sqrt((x*x)+(y*y));


    }
    public boolean equals(Object other){
        if(other instanceof PointV5) {

        }
        return false;
    }
    public String toString(){
        return"(" +x + ", " + y +")";
    }

}
