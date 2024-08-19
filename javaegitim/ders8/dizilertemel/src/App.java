// DİZİLER(arrays)
public class App {
    public static void main(String[] args) {
        String[] ogrenciler = new String[3]; // Oluşturacağımız dizi hangi veri tipinden oluşacaksa onu başa yazar köşeli parantez açarız(String[],int[]) ve diziye isim veririz(ogrenciler)
                                             // Oluşacak diziyi new String["Eleman sayısı"] şeklinde tanımlar o eleman sayısı boyutunda boş bi string dizisi oluştururuz
        ogrenciler[0] = "Eren"; //  Dizimizin 0 indeksli elemanı "Eren" şeklinde tanımlandı. String dizisi olduğu için tüm elemanlar string veri tipinde olmalı
        ogrenciler[1] = "Muhammet";
        ogrenciler[2] = "Talu";
        // ogrenciler = ["Eren","Muhammet","Talu"]
        // ogrenciler[3] = "Çalban"; //Liste 3 elemanlı tanımlandığı için 3. indeks yoktur bu sebeple bu tanımlanamaz ve hata verir
        for(int i=0;i<ogrenciler.length;i++){ // Listenin tüm indekslerine erişebileceğimiz bir döngü kurduk(i değişkeni)
            System.out.println(ogrenciler[i]); // ogrenciler[i] ile listenin tüm elemanlarını yazdırırız
        }
        System.out.println("--------------------------"); // iki çıktıyı ayırmak için oluşturduğumuz çıktı
        // Elemanları yazdırmak için daha yaygın ve rahat olan İkinci yöntem
        for(String ogrenci : ogrenciler){ // String veri tipinde olan ogrenciler listesindeki her elemanı gez ve bu elemanları ogrenci değişkenine ata
            System.out.println(ogrenci); // ogrenci String değişkenini yazdır
        }
    }
}