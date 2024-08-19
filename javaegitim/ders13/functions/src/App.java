//FONKSİYONLAR,METHODLAR,OPERASYONLAR
// fonskiyonlar ikiye ayrılır
// 1) return eden fonksiyon (hangi veri tipi ise onu ön ad olarak veririz)
// 2) return etmeyen, işlem yapan fonksiyon (void fonksiyonlar)
public class App {
    public static void main(String[] args) {
        String mesaj = "Bugun hava guzel";
        mesaj.substring(0, 5); // Substring hazır bir fonksiyondur
                                                   // İki parametre ister
                                                   // Return eden fonskiyon tipidir
                                                   // mesajı 0'dan 5'e kadarki kısmını return eder ve bırakır işlem yapmaz
        String yeniMesaj = mesaj.substring(0, 5); // Substring ile return ettiğimiz kısmı yeniMesaj değişkenine atadık
        System.out.println(yeniMesaj); // System.out.println hazır bir fonksiyondur
                                       // void fonksiyondur, return etmez işlem yapar
                                       // yeniMesaj değişkenini yazdırır


        // Kendi oluşturduğumuz return eden fonksiyonumuzu kullanalım
        // String toplam = toplama(1, 5); Şeklinde yazarsak hata verir çünkü int döndüren int tipinde fonksiyonunu string değişkene atayamayız
        int toplam = toplama(1, 5); // Şeklinde yazarsak hata vermez çünkü int döndüren int tipinde fonksiyonu int tipinde değişkene atadık 
        System.out.println(toplam);
        

        //Kendi oluşturduğumuz return etmeyen fonksiyonumuzu kullanalım
        // String denemeDegiskeni = hava(); Şeklinde yazarsak hata verir çünkü bişey döndürmeyen bir fonksiyonu bir değişkene atayamayız
        hava(); // Şeklinde yazarsak hata vermez çünkü bişey döndürmeyen sadece bir operasyon yapan void fonksiyonu çalışır


        //Kendi oluşturduğumuz sınırsız parametreli int fonskiyonunu kullanalım
        int carpilmis = carp(1,5,6,2,3); // sınırsız değişken alan fonksiyona 5 parametre verdik ve return edilen çarpımı carpilmis değişkenine atadık
        System.out.println(carpilmis);

    }
   // Kendimiz bir int tipi return eden fonksiyon yazarsak
   public static int toplama(int sayi1,int sayi2){ // toplama adında iki integer parametre isteyen integer veri tipinde fonksiyon oluşturduk
        return sayi1 + sayi2; // bu fonksiyonun görevi iki parametrenin toplamını döndürmek
   }

   // Kendimiz bir return etmeyen(void) fonksiyonu yazarsak
   public static void hava(){
        System.out.println("Hava cok guzel");
   }

   // Sınırsız parametreli return eden integer fonksiyonu yazarsak
    public static int carp(int... sayilar){ // içine int... yazarak sınırsız integer değer alabilen
                                            // ve bu integerları sayilar dizisine atacak şekilde bir int tipinde fonksiyon

        int carpim = 1;
        for(int sayi:sayilar){ // girilen int tipindeki parametrelerin bulunduğu sayilar dizisindeki elemanları gezeriz
                               // ve bu elemanları sayi değişkenine atarız
            carpim *=sayi;
    }
        return carpim; // sayilar dizisindeki elemanların çarpımı olan carpim değişkenini döndür
   }
}