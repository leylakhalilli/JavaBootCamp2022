package Homework1.stringDemo;

public class Main {
    public static void main(String[] args) {
        String txt = "hello java";
        System.out.println(txt.length());

        System.out.println(txt.charAt(4));//0dan bashlayir

        System.out.println(txt.concat("!"));
        System.out.println(txt);

        System.out.println(txt.startsWith("h"));
        System.out.println(txt.startsWith("h", 0));

        char[] c = new char[5];
        txt.getChars(0, 5, c, 0);
        System.out.println(c);
        ////////////////////////////////


        System.out.println(txt.replace("h", "H"));
        for (String text : txt.split(" ")) {
            System.out.println(text);
        }

    }
}
