// Çok boyutlu dizi(MATRİS)
// 3 BÖLGE VE HER BİR BÖLGE İÇİN 3 ŞEHİR(MATRİS ŞEKLİNDE)
public class App {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3]; // String[][] ile başlayarak String tipinde elemanların olduğu matris tanımlayacağımızı gösterdik
                                                // matrise sehirler adını verip 3'e 3'lük olacağını gösterdik ve 3'e 3'lük sehirler matrisi tanımlandı
        sehirler[0][0] = "Istanbul"; // matrisin elemanlarını sırayla tanımladık
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Van";
        sehirler[2][1] = "Igdir";
        sehirler[2][2] = "Hakkari";
        for(int i=0;i<sehirler.length;i++){ // satır döngüsü
            System.out.println("--------------------"); // satırları ayırmak için yazdığımız çıktı
            for(int j=0;j<sehirler[0].length;j++){ // sütun döngüsü
                System.out.println(sehirler[i][j]); // matrisin elemanını yazdırma
            }
        }
        
    }
}