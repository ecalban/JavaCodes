// DİZİDE SAYIYI BULMA
// aranacak sayı dizi içindeyse true değil ise false döner
public class App {
    public static void main(String[] args) {
        int[] sayilar = new int[]{3,5,8,9,6,1,7,5,3,5};
        int kontrol = 5;
        int sayac = 0;
        for(int eleman: sayilar){
            if(eleman==kontrol){
                sayac++;
            }
        }
        if(sayac==0){
            System.out.println("Sayi dizi icinde degil");
        }
        else{
            System.out.println("Sayi dizi icinde");
        }

    }
}