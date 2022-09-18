package perfectNumber;

public class Main {
    public static void main(String[] args) {

        //6-28
        int num = 28;
        int total = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                total += i;
            }
        }
        if (total == num) {
            System.out.println("Perfect Number\ntotal=" + total);

        } else {
            System.out.println("Not Perfect Number");
        }
    }
}
