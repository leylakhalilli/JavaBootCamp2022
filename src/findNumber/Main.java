package findNumber;

public class Main {
    public static void main(String[] args) {
        int[] numArray = new int[]{1, 2, 5, 7, 8, 9};
        int number = 5;
        boolean var = false;

//        for (int i = 0; i < numArray.length; i++) {
//            if(numArray[i]==number){
//                System.out.println("YES!"+i);
//            }
//        }

        for (int num : numArray) {
            if (num == number) {
                var = true;
                break;
            }
        }
        if (var) {
            System.out.println("found");
        }
    }
}
