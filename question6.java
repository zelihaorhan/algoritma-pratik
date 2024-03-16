import java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        // girilen sayinin faktoriyelini hesaplayan kod

        Scanner scanner = new Scanner (System.in);

        System.out.println("Faktoriyeli hesaplanacak kod:");

        int sayi=scanner.nextInt();

        int faktoriyel=1;

        for(int i=1;i<=sayi;i++){
            faktoriyel*=i;
        }

        System.out.println("Faktoriyelin sonucu:" + faktoriyel);

        scanner.close();

    }
}
