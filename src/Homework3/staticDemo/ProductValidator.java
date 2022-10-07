package Homework3.staticDemo;

public class ProductValidator {


    static {
        System.out.println("static blok");
    }

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public void random() {
        System.out.println();
    }

    //inner class
//    public static class Demo{
//        public static void delete() {
//
//        }
//    }
}
