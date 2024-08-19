// ARKADAŞ SAYILAR
// ilk sayı == ikinci sayının tam bölenlerinin toplamı ve ikinci sayı == ilk sayının tam bölenlerinin toplamı ise ilk sayı ile ikinci sayı arkadaş sayılardır, true döndür
public class App {
    public static void main(String[] args) {
        int sayi1 = 220; // bölenlerinin toplamını bulacağımız ilk sayı
        int sayi2 = 284; // bölenlerinin toplamını bulacağımız ikinci sayı
        int bolen_toplam_1 = 0; // ilk toplamı kaydedeceğimiz değişken
        int bolen_toplam_2 = 0; // ikinci toplamı kaydedeceğimiz değişken


        for(int i=1;i<sayi1;i++){ // 1'den başlayıp sayıya kadar giden döngü
            if(sayi1%i==0){      // sayıyı tam bölüyor ise
                bolen_toplam_1+=i; // birinci toplama ekle
            }
        }

        for(int i=1;i<sayi2;i++){
            if(sayi2%i==0){
                bolen_toplam_2+=i;
            }
        }

        
        if(sayi1==bolen_toplam_2 && sayi2==bolen_toplam_1){ // ilk sayı == ikinci sayının tam bölenlerinin toplamı ve ikinci sayı == ilk sayının tam bölenlerinin toplamı ise
            System.out.println(true);     // true döndür
        }

        else{                             // değil ise
            System.out.println(false);  // false döndür
        }
    }
}