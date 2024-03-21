import java.util.Scanner;

public class question22 {
    public static void main(String[] args) {
        // herhangi bir sayinin herhangi bir dereceden kuvvetini bulan kod.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi=scanner.nextInt();
        System.out.println("Derece giriniz:");
        int derece=scanner.nextInt();

        int sonuc=1;

        for(int i=0;i<derece;i++){
            sonuc*=sayi;
        }

        System.out.println("Sonuc: " + sonuc);

        scanner.close();
    }
}
