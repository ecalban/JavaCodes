// DEĞİŞKENLER, VARIABLES

public class App {
    public static void main(String[] args) {
        // Javada değişken isminde ilk kelimenin ilk harfi küçük geriye kalan bütün kelimelerin ilk harfleri büyük yazılır 
        int ogrenciSayisi  = 10;   // ogrenciSayisi adında integer değişkeni açıldı ve içine 10 yerleştirildi 
        String sinifAdi = "A sinifi";   // sinifAdi adında string değişkeni açıldı ve içine "A sinifi" yerleştirildi 
        System.out.println("A sinifi: 10");   // virgül ile sonlandırmakla beraber "A sinifi: 10" şeklinde bir string yazdırdık 
        System.out.println(sinifAdi + ": " + "10");   // "A sinifi" yazmak yerine sinifAdi değişkeni kullanıldı ve çıktı aynı oldu
        System.out.println("A sinifi" + ": " + ogrenciSayisi);   // "10" yazmak yerine ogrenciSayisi değişkeni kullanıldı ve çıktı aynı oldu
        System.out.println(sinifAdi + ": " + ogrenciSayisi);   // iki değişkeni de kullandık ve çıktı aynı oldu
    }    
}


