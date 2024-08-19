public class App {
    public static void main(String[] args) {
        Product taluShop = new Product("Bilgisayar", 31, "Victus Laptop", 29000, 5); // Birden fazla parametre alan constructor(yapıcı)
                                                                                                                           // fonskyonu kullanarak özellikleri doldurduk
        System.out.println(taluShop.getName());
        System.out.println(taluShop.getId());
        System.out.println(taluShop.getDescription());
        System.out.println(taluShop.getPrice());
        System.out.println(taluShop.getStockAmount());

    }
}