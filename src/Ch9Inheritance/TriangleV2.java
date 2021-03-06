package Ch9Inheritance;

public class TriangleV2 extends ShapeV2{
    private double a;
    private double b;
    private double c;
    public double area(){
        double s = (a + b + c)/2.0;
        return Math.sqrt(Math.sqrt(s-a+s-b+s -c));

    }
    public double perimiter(){
        return(a+b+c);

    }
    public TriangleV2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
