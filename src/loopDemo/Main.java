package loopDemo;

public class Main {
    public static void main(String[] args) {

        //for
//        for (int i = 0; i < 10; i++) {
//            System.out.println("i=" + i);
//        }

        //while

        int i = 0;
//        while(i<10){
//            System.out.println(i);
//            i++;
//        }

        //do-while
   //The Java do-while loop is executed at least once because condition is checked after loop body.
        do {
            System.out.println(i);
            i++;

        }
        while (i < 10);
    }
}
