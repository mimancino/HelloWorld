public class MichaelMancinoMode {
    public static void main(String[]args){
        int nums = 669260267;
        int max = efficient(nums);
        System.out.println(max);


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
            if(numlist[i] > max){
                max = numlist[i];
                mode = i;

            }



        }
        return mode;


    }
}
