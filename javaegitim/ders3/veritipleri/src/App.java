// Veri tipleri

// java dilinde tanımladığımız değişkenin türünü değiştiremeyiz
/* 
int sayi = 35;
sayi = "35";
kodu çalışmaz tanımladığımız değişkenin türü değişemeyeceği için
 */


public class App {
    public static void main(String[] args) {
        int sayi = 123; // integer
        boolean bool = true; // boolean
        double kusurat = 123.58; // küsürat
        char harf = 'A'; // tek karakter tutar, tek tırnak kullanılmalı
        String yazi = "A"; // string
        System.out.println(sayi);
        System.out.println(bool);
        System.out.println(kusurat);
        System.out.println(harf);
        System.out.println(yazi);
    }
}