// Class' lar aynı zamanda özellik de tutabilir
public class App {
    public static void main(String[] args) {
        ProductFeatures taluShop = new ProductFeatures();
        taluShop.id = 31;
        taluShop.name = "bilgisayar";
        taluShop.desctription = "victus laptop";
        taluShop.price = 29000;
        taluShop.stockAmount = 5;
        // class yapısında oluşan ürün değişkenlerini istediğimiz özelliklere göre doldurduk
        System.out.println(taluShop.name);
        System.out.println(taluShop.price);
        // girdiğimiz ürün özelliklerinin bi kaçını yazdırdık
        ProductManager productManager = new ProductManager();
        // Ürünlerini tanımlayıp oluşturduğumuz nesneyi ekleme işlemi yapmak için Manager nesnesinde kullandık ve ekledik
        productManager.Add(taluShop);
    }
}