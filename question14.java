import java.util.Scanner;
public class question14 {
    public static void main(String[] args) {
        // Klavyeden girilen 25 adet sayi icerisinde negatif olanlarin toplamini, cift sayilarin carpimini, 7'ye esit olanlarin adedini bulup ekrana yazdiran kod.

        Scanner scanner = new Scanner(System.in);

        int negTop=0;
        int ciftCarp=1;
        int yedi=0;

        for(int i=0;i<25;i++){
            System.out.print("Bir sayi giriniz: ");
            int sayi=scanner.nextInt();
            if(sayi<0){
                negTop+=sayi;
            }
            else if(sayi%2==0){
                ciftCarp*=sayi;
            }
            else if(sayi==7){
                yedi++;
            }
        }

        System.out.print("Negatif sayilarin toplami: " + negTop);
        System.out.print("Cift sayilarin carpimi:" + ciftCarp);
        System.out.print("7 sayisinin adedi: " + yedi);

        scanner.close();
    }
}
