// SAYI ASAL MI?
// asal ise true değil ise false döner
public class App {
    public static void main(String[] args) {
        int sayi = 15; // kontrol edilecek sayının tanımlanması
        int c = 0; // kontrol sayacı

        if(sayi==0 || sayi == 1){ // sayi == 0 ya da ( or (||) ) sayi == 1 ise içeri girer
            System.out.println(false); // içeri girerse 0 ya da 1 asal olmadığı için false döner
        }

        else if(sayi==2){ // sayi==2 ise
            System.out.println(true); // sayının 2 olma durumunu döngüde yapamadığımız için özel tanımladık ve asal olduğu için true döndürürüz
        }

        for(int i=2;i<sayi;i++){ // 2'den sayıya kadar olan sayıların döngüsü
            if(sayi%i == 0){ // eğer sayi'nın i'ye bölümünden kalan 0 ise 
                c++; // kontrolü(c) arttır
            }

        }
        if(c!=0){ // kontrol 0 dan farklı ise
            System.out.println(false); // sayaç(c) artmıştır ve sayının asal olmadığı anlamına gelir

   
        }
        else{ // kontrol 0 ise
            System.out.println(true); // sayaç(c) değişmemiştir ve sayının asal olduğu anlamına gelir

        }
    }
}