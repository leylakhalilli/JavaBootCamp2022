package Homework2.methodOverloading;

public class Main {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println(calculator.add(4,5));
        System.out.println(calculator.add(4,5,9));
    }
}
