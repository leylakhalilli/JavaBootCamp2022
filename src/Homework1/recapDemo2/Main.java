package Homework1.recapDemo2;

public class Main {
    public static void main(String[] args) {
//        double[] myList = new double[4];
        double[] myList = {1.2, 9.3, 1.4, 4.5};
        double total = 0;
        double maxNum = myList[0];
        for (double number : myList) {


            if (maxNum < number) {
                maxNum = number;
            }


            total += number;
            System.out.println(number);
        }
        System.out.println("total " + total);
        System.out.println("maxNum " + maxNum);


    }
}
