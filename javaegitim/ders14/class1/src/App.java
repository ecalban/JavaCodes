// Class kullanım amacı gruplamadır
// oluşturduğumuz CustomerManager class yapısını çağırıp kullanalım
public class App {
    public static void main(String[] args) {
        // Class yapısı reference type'dır. reference type detayı sonraki derste
        CustomerManager customerManager; // Bellekte CustomerManager türünde customerManager nesnesi oluşturur
        CustomerManager customerManager2 = new CustomerManager();  // Bellekte CustomerManager türünde ikinci bir customerManager2 nesnesi oluşturur
        customerManager = customerManager2; 
        customerManager.Add();  
        customerManager.Remove();
        customerManager.Update();

    }
}  