// KALIN İNCE SESLİ HARF KONTROLÜ
public class App {
    public static void main(String[] args) {
        char harf = 'E'; // kontrol edilecek harf

        // KOD 1
        if(harf == 'A' || harf == 'I' || harf == 'O' || harf == 'U'){ // harf == 'A' ya da harf == 'I' ya da harf == 'O' ya da harf == 'U' ise
            System.out.println(harf + " harfi kalindir");             // harfin kalın olduğunu yazdır
        }
        else if(harf == 'E' || harf == 'İ' || harf == 'Ö' || harf == 'Ü'){
            System.out.println(harf + " harfi incedir");
        }

        // KOD 2
        switch(harf){ // birden fazla duruma bakacağımız için switch açarız
            case 'A': 
            case 'I':
            case 'O':
            case 'U':
                System.out.println(harf + " harfi kalindir"); // harfin A,I,O,U' dan biri olduğu durumda buraya girer ve harfin kalın olduğu yazdırılır
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println(harf + " harfi incedir");
                break;

        }
    }
}