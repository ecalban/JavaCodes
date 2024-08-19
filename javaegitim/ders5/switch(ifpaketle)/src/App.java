// SWITCH (BİRDEN FAZLA OLASLIĞI OLAN DURUMU PAKETLEME)
// aşağıdaki kodun amacı öğrencinin aldığı nota göre ona mesaj veren kod
public class App {
    public static void main(String[] args) {
        char not = 'A'; // char ile Tek haneli not tanımladık bu öğrenci notunu ifade ediyor
        switch (not) { // switch kalıbının içine kontrol edeceğimiz değişkenin ismini yazarız
            case 'A': // not değişkenin A olduğu durum anlamına geliyor
                System.out.println("Mükemmel: Geçtiniz"); // not A ise buraya girer ve "Mükemmel: Geçtiniz" çıktısı verir
                break; // diğer durumlara bakmaması için kod burda durmalı o sebeple break koy
            case 'B':
                System.out.println("Çok iyi: Geçtiniz");
                break;
            case 'C':
                System.out.println("İyi: Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena değil: Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default: // not değişkeni case durumları dışında ise default kısmına düşer
                System.out.println("Yanlis girdi"); // buraya girdiği vakit "Yanlis girdi" çıktısı verir
                break;
        }
    }
}
// DÜZENLEMEK İSTEDİĞİN KODU SEÇ VE CTRL F YAP FORMAT OLSUN!!!