import java.util.Scanner;
public class question26 {
    public static void main(String[] args) {
        // 1'den 63'e kadar olan sayilar arasinda istenilen sayiyi maksimum 6 seferde bulan programin kodu.

         Scanner scanner = new Scanner(System.in);

         int hedefSayi;
         int tahmin;
         int denemeSayisi=0;

         System.out.print(
            "1 ile 63 arasinda bir sayi giriniz:"
         );
         hedefSayi=scanner.nextInt();

         while(true){
            denemeSayisi++;
            System.out.println("Tahmininizi giriniz:");
            tahmin=scanner.nextInt();

            if(tahmin==hedefSayi){
                System.out.println("Tebrikler, hedefinize " + denemeSayisi + " .adimda ulastiniz." );
                break;
            }
            else if(tahmin<hedefSayi){
                System.out.println("Daha buyuk bir sayi giriniz...");
            }
            else{
                System.out.println("Daha kucuk bir sayi giriniz...");
            }

            if(denemeSayisi>=6){
                System.out.println("Maksimım deneme sayisina ulastiniz. Sayiyi bulamadiniz.");
                break;
            }


         }
    }
}
