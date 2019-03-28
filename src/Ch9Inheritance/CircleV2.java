package Ch9Inheritance;

public class CircleV2 extends ShapeV2 {
    private double readius;
    public CircleV2(double readius){
        this.readius = readius;
    }
    public double area(){
        return Math.PI*(Math.pow(readius,2.0));

    }
    public double perimiter(){
        return 2.0 * Math.PI * readius;

    }

}
