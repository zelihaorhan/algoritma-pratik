import java.util.Scanner;
public class question10 {
    public static void main(String[] args) {
        // Girilen sayinin kac basamakli oldugunu bulan kod

        Scanner scanner = new Scanner (System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi=scanner.nextInt();

        int basamakSayisi=1;

        while(sayi>9){
            sayi=sayi/10;
            basamakSayisi++;
        }

        System.out.print("Girilen sayinin basamak sayisi: " + basamakSayisi);

        scanner.close();
    }
}
