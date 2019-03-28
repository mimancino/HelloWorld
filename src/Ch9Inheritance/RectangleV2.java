package Ch9Inheritance;

public class RectangleV2 extends ShapeV2 {
    private double width;
    private double height;

    public double area(){
        return width * height;


    }
    public double perimiter(){
        return (width+height) * 2.0;

    }
    public RectangleV2(double width, double height){
        this.width = width;
        this.height = height;

    }
}
