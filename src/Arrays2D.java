import java.util.Arrays;

public class Arrays2D {
    public static void main(String[]args){
        //S1-declare a 2d array
        int counter = 1;
        int[][] borg = new int[20][20];

        for(int i = 0; i<borg.length;i++)  {

            for(int j = 0; j<borg[i].length;j++){
                borg[i][j] = (i+1)*(j+1);

            }
            System.out.println();

        }
    for(int i = 0; i<borg.length;i++) {
        System.out.println(Arrays.toString(borg[i]));

    }
    }
}
