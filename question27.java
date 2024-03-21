import java.util.Scanner;
public class question27 {
    public static void main(String[] args) {
        // Girilen decimal (onluk) bir sayinin binary (ikilik) bir sayiya donusturen kod.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ondalik bir sayi giriniz:");
        int ondalik=scanner.nextInt();

        String ikiliSayi=decimalToBinary(ondalik);

        System.out.println("İkilik (binary) sayi:" + ikiliSayi);

        scanner.close();
    }

    public static String decimalToBinary(int ondalik){
        StringBuilder binary=new StringBuilder();
        while(ondalik>0){
            int kalan = ondalik%2;
            binary.insert(0, kalan);
            ondalik/=2;
        }
        return binary.toString();
    }
}
