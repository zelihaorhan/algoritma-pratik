import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        //kullanicinin girdigi iki sayinin kareleri toplamini bulan kod

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz:");
        int sayi1=scanner.nextInt();

        System.out.print("Ikinci sayiyi giriniz:");
        int sayi2=scanner.nextInt();

        int toplam=(sayi1*sayi1)+(sayi2*sayi2);

        System.out.print("Girilen sayilarin kareleri toplami:" + toplam);

        scanner.close();
    }
}
