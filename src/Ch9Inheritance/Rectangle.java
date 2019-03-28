package Ch9Inheritance;

public class Rectangle implements ShapeV1 {
    private double width;
    private double height;

    public double area(){
        return width * height;


    }
    public double perimiter(){
        return (width+height) * 2.0;

    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;

    }
}
