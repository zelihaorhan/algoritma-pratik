import java.util.Scanner;
public class question12 {
    public static void main(String[] args) {
        // klavyeden girilen 20 adet sayidan cift sayilarin toplaminin tek sayilarin toplamina oranini bulan kod

        Scanner scanner = new Scanner(System.in);

        int tekTop=0;
        int ciftTop=0;

        for(int i=0;i<20;i++){
            System.out.print("Sayi giriniz: ");
            int sayi=scanner.nextInt();
            
            if(sayi%2==0){
                ciftTop+=sayi;
            }
            else{
                tekTop+=sayi;
            }
        }

        double oran=ciftTop/tekTop;

        System.out.print("Cift sayilarin toplaminin tek sayilarin toplamina orani: " + oran);

        scanner.close();
    
    }
}
