import java.util.Scanner;
public class WeatherProject {
    public static void main(String[]args) {
        //1. Algorithm for the weather project
        //2. Initialize a cumulative sum variable and an array
        //3. Make a for loop to fill the array and add the cumulative sum variable
        //4. calculate the average
        //5. This program calculates the average temperature for any number of days.
        //6. It also calculates how many temps are above average
        System.out.println("Welcome to the temperature calculator! This takes a certain amount of temperatures and calculates the average of them");
        System.out.println("It also tells you how many days had an above average temperature.");
        Scanner scan = new Scanner(System.in);
        System.out.println("How many temperatures are you entering?(Integer)");
        int ArLength = scan.nextInt();
        int AboveAvg = 0;
        int[] TempList = new int[ArLength];
        double CumSum = 0;
        for(int i = 0; i<ArLength; i++) {
            System.out.print("Day " + (i + 1)  + "'s high temp: ");
            int temp = scan.nextInt();
            System.out.println("");
            TempList[i] = temp;
            CumSum += temp;

        }
        CumSum = CumSum/ArLength;
        System.out.println("Average temp = " + CumSum);
        for(int j = 0; j<ArLength;j++) {
            if (TempList[j] > CumSum){
                AboveAvg++;
            }
        }
        System.out.println(AboveAvg +" days were above average");

    }
    public static void calctemp(){



    }
}
