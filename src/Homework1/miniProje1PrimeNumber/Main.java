package Homework1.miniProje1PrimeNumber;

public class Main {
    public static void main(String[] args) {
        int number = 1;
//        int remainder = number % 2;
        boolean isPrime = true;
        if (number < 2) {
            System.out.println("not prime");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }

    }
}
