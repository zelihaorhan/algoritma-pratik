import java.util.Scanner;
public class question20 {
    public static void main(String[] args) {
        // Girilen sayinin mukemmel sayi olup olmadigini bulan kod.
        //Mükemmel sayı, kendisi hariç bütün pozitif bölenlerinin toplamı kendisine eşit olan sayılardır


        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi giriniz:");
        int sayi=scanner.nextInt();

        int bolenToplam=0;

        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                bolenToplam+=i;
            }
        }

        if(bolenToplam==sayi){
            System.out.println("Girilen sayi mukemmel sayidir.");
        }
        else{
            System.out.println("Girilen sayi mukemmel sayi degildir.");
        }

    }
}
