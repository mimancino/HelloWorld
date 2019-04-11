package Ch12Recursion;

public class RecursiveFuncs {
    public static void main(String[] args) {
        int x = 12;
        System.out.println(f(12));
    }
    public static int f(int x){

        if (x <= 4){
            return x + 4;

        }
        else if( x > 6){
            return  2*f(x - 3) -3;
        }
        else{
            return f(x+2) + 1;
        }

    }


}

