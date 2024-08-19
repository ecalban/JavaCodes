// 3 SAYIDAN EN BUYUGUNU BULMA
public class App {
    public static void main(String[] args) {
        int sayi1 = 15;
        int sayi2 = 30;
        int sayi3 = 25;
        int enbuyuk = sayi1;
        if(sayi2>enbuyuk){
            enbuyuk = sayi2;
        }
        if(sayi3>enbuyuk){
            enbuyuk = sayi3;
        }
        System.out.println(enbuyuk);

    }
}