import java.util.Scanner;
public class question27 {
    public static void main(String[] args) {
        // Girilen decimal (onluk) bir sayinin binary (ikilik) bir sayiya donusturen kod.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ondalik bir sayi giriniz:");
        int onluk=scanner.nextInt();

        String ikiliSayi=decimalToBinary(onluk);

        System.out.println("İkilik (binary) sayi:" + ikiliSayi);

        scanner.close();
    }

    public static String decimalToBinary(int onluk){
        StringBuilder binary=new StringBuilder();
        while(onluk>0){
            int kalan = onluk%2;
            binary.insert(0, kalan); //eklenen biti başa ekleyin
            onluk/=2;
        }
        return binary.toString();
    }
}
