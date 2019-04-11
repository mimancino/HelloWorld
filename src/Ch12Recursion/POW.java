package Ch12Recursion;

public class POW {
    public static void main(String[] args) {
        System.out.println(powR(3,4));
    }
    public static int powNR(int base, int exponent){
        int start = base;
        for(int i = 1; i<exponent;i++){
            base *=start;

        }
        return base;


    }
    public static double powR(int base,int exponent){
        if(exponent == 0){
            return 1;
        }
        else{
            return base * powR(base, exponent - 1);
        }
    }
}
