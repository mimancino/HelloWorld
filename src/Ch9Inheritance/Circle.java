package Ch9Inheritance;

public class Circle implements ShapeV1 {
    private double readius;
    public Circle(double readius){
        this.readius = readius;
    }
    public double area(){
        return Math.PI*(Math.pow(readius,2.0));

    }
    public double perimiter(){
        return 2.0 * Math.PI * readius;

    }

}
