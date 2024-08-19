// STRING METODLARI
public class App {
    public static void main(String[] args) {
        String mesaj = "Fatih talu iyi"; // bir string metni tanımladık
        System.out.println(mesaj); // tanımladığımız strgingi yazdıralım
        System.out.println("Eleman sayisi: " + mesaj.length()); // Stringin eleman sayısını lenght kullanarak yazdırabiliriz 
        System.out.println("Mesajin 5.elemani: " + mesaj.charAt(4)); // Stringin tek bir elemanını yazdırmak istersek charAt içine indeksini yazarız
        System.out.println(mesaj.concat(" hoca.")); // Concat kullanarak concat içine yazdığımız stringi, mesaj stringine ekleyip yazdırdık ama mesaj stringi değişmedi
        System.out.println(mesaj.startsWith("F")); // startsWith içine yazdığımız metin, stringin başlangıcındaysa true değilse false döner
        System.out.println(mesaj.endsWith("i")); // endsWith içine yazdığımız metin, stringin sonunda ise true değilse false döner
        char[] karakterler = new char[5]; // 5 elemanlı karakterler dizisi oluşturduk
        mesaj.getChars(0, 5, karakterler, 0); // getChars kullanarak stringin 0 dan 5'inci indekse kadar olan elemanlarını karakterler dizisine atar
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('u')); // indexOf içine yazılan karakter stringde hangi indekste ise onu döndürür
        System.out.println(mesaj.indexOf('a')); // aramaya soldan başladığı için ilk gördüğü 'a' yı yazdırır
        System.out.println(mesaj.lastIndexOf('a')); // aramaya sağdan başladığı için sağdan ilk gördüğü 'a' yı yazdırır
        System.out.println(mesaj.replace("a", "e")); // Stringdeki target'ı replacement ile değiştirip yazdırır
        System.out.println(mesaj.substring(5)); // substring kullanırsak, stringin substring içine yazdığımız indeks ve sonrasını yazdırır
        System.out.println(mesaj.substring(5,10)); // substringe iki indeks verirsek, metinde ilk indeksten başlayıp ikinci indekse kadar kısmı yazdırır
        for (String kelime : mesaj.split(" ")){ // boşluk görene kadarki kısmı ayır
            System.out.println(kelime); // bu kısmı yazdır
        System.out.println(mesaj.toLowerCase()); // stringdeki tüm harfleri küçült ve stringi yazdır
        System.out.println(mesaj.toUpperCase()); // stringdeki tüm harfleri büyüt ve stringi yazdır
        String mesaj2 = "   Fatih talu iyi   ";
        System.out.println(mesaj2.trim()); // trim kullanarak tanımladığımız stringin başı ve sonundaki boşlukları alır
        }
    }
}
