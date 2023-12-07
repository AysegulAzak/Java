public class Product {
    public String name;
    public String model;
    public int price;
    public int stockAmount;

    public Product() { // default constructor(parametresiz)
        this("Lenovo", "ThinkPad", 3000, 700);
//        this.name = "MacBook";
//        this.model = "Pro";
//        this.price = 15000;
//        this.stockAmount = 400;
    }
    public Product(String name, String model, int price, int stockAmount) { //parametreli constructor
        this.name = name;
        this.model = model;
        this.price = price;
        this.stockAmount = stockAmount;
    }
}
