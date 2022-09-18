package array;

public class Main {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int num4 = 4;
        int num5 = 5;
        int num6 = 6;

        int[] number = new int[6];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;
        number[5] = 6;
        for (int i = 0; i< number.length; i++) {
            System.out.println(number[i]);
        }

//        for(int num:number){
//            System.out.println(num);
//        }
    }
}
