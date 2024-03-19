import java.util.Scanner;
public class question19 {
    public static void main(String[] args) {
        //  Klavyeden girilen bir sayinin negatif, pozitif veya 0 olup olmadigini bulan kod.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi giriniz:");

        int sayi=scanner.nextInt();

        if(sayi>0){
            System.out.println("Girilen sayi pozitiftir.");
        }
        else if(sayi<0){
            System.out.println("Girilen sayi negatiftir.");
        }
        else{
            System.out.println("Girilen sayi 0'dir.");
        }
        scanner.close();
    }   

}
