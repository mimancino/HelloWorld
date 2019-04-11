package Ch12Recursion;

public class Factorial {
    public static void main(String[] args) {
        double x = 170.0;
        factorio(x);
        System.out.println(factorio(x));
    }
    public static double factorio(double x){
        if(x == 1 || x == 0){
            return(1.0);
        }
        return(x*factorio(x-1));
    }
}
