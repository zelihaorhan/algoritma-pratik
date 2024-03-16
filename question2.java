import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        // iki sayinin toplamini veren kod

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz:");
        int sayi1=scanner.nextInt();

        System.out.print("Ikinci sayiyi giriniz:");
        int sayi2=scanner.nextInt();

        int toplam=sayi1+sayi2;

        System.out.print("Girilen sayilarin toplami:" + toplam);

        scanner.close();
    }
}
