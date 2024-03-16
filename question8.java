import java.util.Scanner;
public class question8 {
    public static void main(String[] args) {
        //bolme islemini cikarma kullanarak yapan kod

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bolunen sayiyi giriniz:");
        int bolunen = scanner.nextInt();

        System.out.print("Bolen sayiyi giriniz:");
        int bolen = scanner.nextInt();

        int sonuc=0;

        while(bolunen>=bolen){
            bolunen-=bolen;
            sonuc++;
        }

        System.out.print("Bolme isleminin sonucu:" + sonuc);

        scanner.close();
    }
}
