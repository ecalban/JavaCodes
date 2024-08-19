// MÜKEMMEL SAYI
// sayının tam bölenlerinin toplamı = sayı ise true değil ise false döner
public class App {
    public static void main(String[] args) {
        int sayi = 6; // tam bölenlerine bakılacak sayı
        int toplam = 0; // tam bölenlerinin ekleneceği değişken
        for(int i=1;i<sayi;i++){ // 1' den sayi'ya kadar olan sayıların döngüsü
            if(sayi%i==0){ // sayının i'ye bölümünden kalan 0 ise tam bölüyodur
                toplam+=i; // i tam bölen olduğu için toplama ekle
            }
        }
        if(toplam==sayi){               // tam bölen toplamı sayi'ya eşit ise
            System.out.println(true); // true döndür
        }
        else{                            // değil ise
            System.out.println(false); // false döndür
        }
    }
}