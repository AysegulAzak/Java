public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product.name + product.model + product.price + product.stockAmount);

        Product product1 = new Product("Lenovo", "ThinkPad", 5000, 300);
        System.out.println(product1.name + product1.model + product1.price + product1.stockAmount);



    }
}