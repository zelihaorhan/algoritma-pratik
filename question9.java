import java.util.Scanner;
public class question9 {
    public static void main(String[] args) {
        // girilen sayinin istenilen sayiya gore modunu hesaplayan kod

        Scanner scanner = new Scanner(System.in);

        System.out.print("Modu alinacak sayiyi giriniz: ");
        int sayi=scanner.nextInt();

        System.out.print("Modu giriniz: ");
        int mod=scanner.nextInt();

        int sonuc=0;

        sonuc=sayi%mod;

        System.out.print("Mod isleminin sonucu: " + sonuc);

        scanner.close();
    }
}
