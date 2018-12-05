package CH7Arrays;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayPractice {
    public static void main(String[]args){
        int nums = 669260267;
        int max = efficient(nums);
        System.out.println(max);


        int[] noomberz = new int[5];
        //before populating array
        System.out.println(Arrays.toString(noomberz));
        for(int i = 0; i<5; i++){

            noomberz[i] = i+1;


        }
        //after populating array
        System.out.println(Arrays.toString(noomberz));
        //declare and init.
    Scanner scan = new Scanner(System.in);
    System.out.println("What size array do you want");
    int length = scan.nextInt();
    System.out.println("What range of numbers do you want (enter one number,0-your number)");
    int range = scan.nextInt();
    int [] rando = new int[length];
    for(int i = 0; i < rando.length; i++ ){
            rando[i] = (int)(Math.random() * range);

        }
        System.out.println(Arrays.toString(rando));

    }
    public static int efficient(int num){
        int[] numlist = new int[10];
        int max = 0;
        int mode = 0;
        while (num > 0){
            numlist[num%10]++;
            num/=10;
        }
        for(int i = 0; i<numlist.length;i++){
            if(numlist[i] >= max){
                max = numlist[i];
                mode = i;

            }


        }
        return mode;


    }




    public static int innefficencyincarnate(int noombers){//my stupid ass algorithm
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        while(noombers>0){
            if(noombers % 10 == 0){
                zero++;

            }
            else if(noombers % 10 == 1){
                one++;

            }
            else if(noombers % 10 == 2){
                two++;

            }
            else if(noombers % 10 == 3){
                three++;

            }
            else if(noombers % 10 == 4){
                four++;

            }
            else if(noombers % 10 == 5){
                five++;

            }
            else if(noombers % 10 == 6){
                six++;

            }
            else if(noombers % 10 == 7){
                seven++;

            }
            else if(noombers % 10 == 8){
                eight++;

            }
            else if(noombers % 10 == 9){
                nine++;

            }
            noombers/=10;

        }
        int max = Math.max(Math.max(Math.max(zero,one),two),three);
        int max2 =  Math.max(Math.max(Math.max(four,five),six),seven);
        int max3 =  Math.max(eight,nine);

        int finalmax = Math.max(Math.max(max,max2),max3);

        if (finalmax == zero){
            return 0;

        }
        else if (finalmax == one){
            return 1;

        }
        else if (finalmax == two){
            return 2;

        }
        else if (finalmax == three){
            return 3;

        }
        else if (finalmax == four){
            return 4;

        }
        else if (finalmax == five){
            return 5;

        }else if (finalmax == six){
            return 6;

        }
        else if (finalmax == seven){
            return 7;

        }
        else if (finalmax == eight){
            return 8;

        }
        return 9;




    }

}
