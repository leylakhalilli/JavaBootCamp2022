package Homework2.classesWithAttribute;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "product", "random", 5000, 5);
        product.getName();
        product.getDescription();
        product.getId();
        product.getPrice();
//        product.name = "Computer";
//        product.id = 1;
//        product.price = 5000;
//        product.stockAmount = 4;
        ProductManager productManager = new ProductManager();
        productManager.add(product);

    }
}
