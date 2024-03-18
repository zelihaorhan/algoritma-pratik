import java.util.Scanner;
public class question16 {
    public static void main(String[] args) {
        // Girilen sayinin 5'in kuvveti olup olmadigini bulan programin kodu

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi=scanner.nextInt();

        if(besinKuvvetiMi(sayi)){
            System.out.println(sayi+" sayisi 5'in kuvvetidir.");
        }
        else{
            System.out.println(sayi+ " sayisi 5'in kuvveti degildir.");
        }

        scanner.close();


    }

    public static boolean besinKuvvetiMi(int sayi){
        if(sayi<=0){
            return false;
        }

        while(sayi>1){
            if(sayi%5!=0){
                return false;
            }
            sayi/=5;
        }
        return true;
    }
}
