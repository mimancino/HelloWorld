import java.util.Scanner;

public class MichaelMancinoRandomHatV2 {
    public static void main(String[]args){
        start();
    }
    public static void start(){
        Scanner scan = new Scanner(System.in);
        int amt = 1;
        do{
                System.out.println("How many teams?(Must be an even number)");
                amt = scan.nextInt();

        }while(amt% 2 !=0);
        int[] teams = new int[amt];
        for(int i = 0; i <teams.length;i++){
            teams[i] = i+1;
        }
        core(teams);
    }
    public static void core(int[] teams){
        int pick = -1;
        int pick2 = -1;
        for(int i = 0; i<teams.length/2;i++){
            while(pick == -1) {
                pick = (int)(Math.random() * (teams.length));
                pick = teams[pick];
            }


            while(pick2 == -1 || pick == pick2) {
                pick2 =  (int)(Math.random()*(teams.length));
                pick2 = teams[pick2];
            }

            System.out.println("Teams " + pick + " and " + pick2 + " will battle.");
            teams[pick-1] = -1;
            teams[pick2-1] = -1;
            pick = -1;
            pick2 = -1;

        }

    }
}
