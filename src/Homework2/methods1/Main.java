package Homework2.methods1;

public class Main {
    public static void main(String[] args) {

        findNumber();
    }

    public static void findNumber() {
        int[] numArray = new int[]{1, 2, 5, 7, 8, 9};
        int number = 5;
        boolean var = false;


        for (int num : numArray) {
            if (num == number) {
                var = true;
                break;
            }
        }
        if (var) {
            sendMessage(number);
        }
    }

    public static void sendMessage(int number) {
        System.out.println("found=" + number);

    }

}
