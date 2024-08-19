public class App {
    public static void main(String[] args) {
        Product taluShop = new Product();
        
        taluShop.setId(31);
        taluShop.setName("Bilgisayar");
        taluShop.setDescription("Victus Laptop");
        taluShop.setPrice(29000);
        taluShop.setStockAmount(5);

        System.out.println(taluShop.getName());
        System.out.println(taluShop.getDescription());
        System.out.println(taluShop.getId());
        System.out.println(taluShop.getPrice());
        System.out.println(taluShop.getStockAmount());
    }
}