package Ch9Inheritance;

public class Cylinder extends Prism {

    private double radius;

    public Cylinder(double radius, double height){
        super(height);
        this.radius = radius;


    }
    public double getBaseArea(double radius){
        return Math.PI * (Math.pow(radius,2));

    }
    public double surfaceArea(double radius, double height){
        return (2 * Math.PI * radius * height) + (2 * Math.PI * (Math.pow(radius, 2)));
    }

    public double getRadius() {
        return radius;
    }
}
