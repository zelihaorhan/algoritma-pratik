import java.util.Scanner;
public class question7 {
    public static void main(String[] args) {
        // carpma islemini toplama kullanarak bulan kod

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ilk carpani giriniz: ");
        int carpan1=scanner.nextInt();

        System.out.print("Ikinci carpani giriniz: ");
        int carpan2=scanner.nextInt();

        int sonuc=0;

        while(carpan1>0){
            sonuc+=carpan2;
            carpan1--;
        }

        System.out.print("Carpimin sonucu: " + sonuc);

        scanner.close();
    }
}
