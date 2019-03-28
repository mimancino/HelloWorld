package Ch9Inheritance;


public class ShapeClient {
    public static void main(String[] args) {
        ShapeV1[] shapes = new ShapeV1[]{new Circle(7.0),new Rectangle(4,5),new Triangle(3,4,5)};
        shapeInfo(shapes);
    }
    public static void shapeInfo(ShapeV1[] shapes){
     for(int i = 0; i<shapes.length;i++){
         System.out.println(shapes[i].area());
         System.out.println(shapes[i].perimiter());


     }
        for(ShapeV1 i : shapes){
            System.out.println(i.area());
            System.out.println(i.perimiter());


        }



    }


}
