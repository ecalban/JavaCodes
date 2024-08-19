// Encapsulation: Verilerin public olarak düzenlenmemesi için alınan önlem(kapsülleme). Veriler private olarak tanımlanır ve set methodu ile düzenlenir
// Setter: Veriyi düzenlemek için yazılan method(fonksiyon)'dur.
// Getter: Veriyi getirmek, görüntülemek için kullanılan method.

public class Product {

    // attribute, field
    private int id; // veriyi public olmasın, gizlemek amacıyla private olarak tanımlarız(kapsülleme)
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    
    // getter
    public int getId() { // veri görüntülenecekse kullanılacak fonksiyon
        return id;
    }
    // setter
    public void setId(int id){ // veri düzenlenecek ise kullanılacak fonksiyon
        this.id = id; // this.id sınıfın başında tanımlanan id değişkenini temsil eder
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }
    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

}
