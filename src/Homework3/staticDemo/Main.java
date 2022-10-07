package Homework3.staticDemo;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name = "book";
        product.price = 10;
        productManager.add(product);

        ProductValidator productValidator = new ProductValidator();
        productValidator.random();


        DatabaseHelper.Crud.delete();
    }
}
