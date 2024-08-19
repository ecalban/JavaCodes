// FOR DÖNGÜSÜ
public class App {
    public static void main(String[] args) {
        for(int i=1;i<10;i+=2){
        // hangi veri tipini döngüye sokacaksak onu başta belirtiriz(int)
        // ilk olarak başlangıcı tanımlanır(i=1)
        // ikinci olarak bitiş şartı tanımlanır(i<10)
        // son olarak artış ya da azalış tanımlanır(i+=2)
        // son kısım i++ olursa i'yi birer birer arttır anlamına gelir
        // son kısım i-- olursa i'yi birer birer azalt anlamına gelir
            System.out.println(i);
        }
        System.out.println("Döngü bitti");
    }
} 