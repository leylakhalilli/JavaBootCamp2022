package Homework2.methods2;

public class Main {
    public static void main(String[] args) {
        String message = "Hi everyone.";
        String newMessage = addCity();
        System.out.println(newMessage);
        int toplam = topla2(2, 3, 4, 5, 6, 7, 8);
        System.out.println(toplam);
    }

    public static int topla2(int... numbers) {
        int toplam = 0;
        for (int sayi : numbers) {
            toplam += sayi;
        }
        return toplam;
    }

    public static void add() {
        System.out.println("added");
    }


    public static void delete() {
    }

    public static void update() {
    }

    public static String addCity() {
        return "Baku";
    }


}
