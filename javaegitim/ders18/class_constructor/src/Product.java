public class Product {
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;

    public Product(String name, int id, String description, double price, int stockAmount){ // Constructor(yapıcı) blok burasıdır burda tanımlama yapılabilir
        this.id = id;
        this.name = name;
        this.description = description;
        this.stockAmount = stockAmount;
        this.price = price;        
    }

    public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public int getStockAmount() {
        return stockAmount;
    }
}
