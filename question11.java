import java.util.Scanner;
public class question11 {
    public static void main(String[] args) {
        // Girilen 3 basamakli bir sayinin basamaklarinin kupleri toplami sayinin kendine esit mi degil mi bulan kod

        Scanner scanner = new Scanner (System.in);

        System.out.print("3 basamakli bir sayi giriniz: ");
        int sayi=scanner.nextInt();

        int birler=sayi%10;
        int onlar=(sayi%100)/10;
        int yuzler=sayi%100;

        int toplam=(birler*birler*birler)+(onlar*onlar*onlar)+(yuzler*yuzler*yuzler);

        if(sayi==toplam){
            System.out.println("Esittir");
        }
        else{
            System.out.println("Esit degildir.");
        }

        scanner.close();


    }
}
