package Ch9Inheritance;

public abstract class ShapeV2 implements Comparable {
    public abstract double area();
    public abstract double perimiter();
    public int compareTo(Object o){
        if (o instanceof ShapeV2) {
            ShapeV2 s= (ShapeV2)o;
            if(this.area() > s.area()){
                return 1;

            }
            else if(this.area() < s.area()){
                return -1;

            }
            else{
                return 0;
            }

        }
        return 1;
    }
}
