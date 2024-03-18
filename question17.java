import java.util.Scanner;
public class question17 {
    public static void main(String[] args) {
        // X ve Y pozitif olmak uzere, X sayisinin carpanlari toplami Y sayisina, Y sayisinin carpanlari toplami X sayisina esit ise bu sayılar dost sayilardir. Buna gore girilen iki sayinin dost sayi olup olmadigini bulan kod.

        Scanner scanner = new Scanner(System.in);

        System.out.print("İki sayi giriniz:");
        int x=scanner.nextInt();
        int y=scanner.nextInt();

        int xTop=0;
        int yTop=0;

        for(int i=1;i<x;i++){
            if(x%i==0){
                xTop+=i;
            }
        }
        for(int i=1;i<y;i++){
            if(y%i==0){
                yTop+=i;
            }
        }

        if(x==yTop && y==xTop){
            System.out.println("Girilen sayilar dost sayilardir.");
        }
        else{
            System.out.println("Girilen sayilar dost sayi degildir.");
        }

        scanner.close();
    }
}
