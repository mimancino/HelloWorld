package Ch9Inheritance;


public class ShapeClientV2 {
    public static void main(String[] args) {
        ShapeV2[] shapes = new ShapeV2[]{new CircleV2(7.0),new RectangleV2(4,5),new TriangleV2(3,4,5)};
        shapeInfo(shapes);
        int answer = shapes[0].compareTo(shapes[1]);
        System.out.println(answer);
    }
    public static void shapeInfo(ShapeV2[] shapes){
     for(int i = 0; i<shapes.length;i++){
         System.out.println(shapes[i].area());
         System.out.println(shapes[i].perimiter());


     }
        for(ShapeV2 i : shapes){
            System.out.println(i.area());
            System.out.println(i.perimiter());


        }



    }


}
