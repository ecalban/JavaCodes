// Diziler 2
// Bir double listesi(ondalıklı oluştur, elemanlarının toplamını ve en büyük elemanı yazdır)
public class App {
    public static void main(String[] args) throws Exception {
        double[] doubleList = {1.3,2.5,7.2,0.7,5.6}; // oduble veri tipinde doubleList adında {1.3,2.5,7.2,0.7,5.6} kullanarak bu elemanlarla double listesi oluşturduk
        double toplam = 0; // toplam değişkeni tanımladık
        double max = 0; // max değişkeni tanımladık
        for(double eleman: doubleList){ // listenin elemanlarını gezip eleman değişkenine atar
            if(eleman>max){ 
                max = eleman; // eleman max'dan büyük ise max'a elemanı ata
            }
            toplam +=eleman; // her elemanı toplama ekle
            }
        System.out.println("Listenin en buyugu: " + max);
        System.out.println("Listenin toplami: " + toplam);
        }

    }

