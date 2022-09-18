package miniProje2;

public class Main {
    public static void main(String[] args) {
        //kalin ince harf
        char harf = 'e';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalin");
                break;
            default:
                System.out.println("ince");
        }
    }
}
