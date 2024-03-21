import java.util.Scanner;

public class question23 {
    public static void main(String[] args) {
        // Girilen bir sayi abundant(guclu) mı deficient(guclu) oldugunu bulan kod.
        // Abundant sayi: bolenlerinin toplami kendinden buyukse olan sayidir.
        // Deficient sayi: bolenlerinin toplami kendinden kucuk olan sayidir.


        Scanner scanner=new Scanner(System.in);

        System.out.println("Bir sayi giriniz:");
        
        int sayi=scanner.nextInt();
        
        int bolenToplam=0;

        for(int i=0;i<sayi;i++){
            if(sayi%i==0){
                bolenToplam+=i;
            }
        }
        if(sayi<bolenToplam){
            System.out.println("Girilen sayi abundant'tir.");
        }
        else{
            System.out.println("Girilen sayi deficient'tir.");
        }
        scanner.close();
    }
}
