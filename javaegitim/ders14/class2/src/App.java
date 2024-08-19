// dört işlem yapabilen basit bir hesap makinesi sınıfı oluşturup onu kullanalım
public class App {
    public static void main(String[] args) {
        hesapmakinesi taluHesapMakinesi = new hesapmakinesi(); // hesapmakinesi tipinde taluHesapMakinesi adında bir sınıf oluşturduk
        int toplam = taluHesapMakinesi.Toplama(3, 5);
        System.out.println(toplam);
        int carpim = taluHesapMakinesi.Carpma(2, 7);
        System.out.println(carpim);
    }
}