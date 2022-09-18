package switchDemo;

public class Main {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("A-Gechtiniz");
                break;
            case 'B':
                System.out.println("B-Gechtiniz");
                break;
            case 'C':
                System.out.println("C-Gechtiniz");
                break;
            case 'F':
                System.out.println("Kaldiniz");
                break;
            default:
                System.out.println("dogru not girin");
        }
    }
}
