import java.util.Scanner;
public class question24 {
    public static void main(String[] args) {
        // 1'den 500'e kadar olan sayilarin toplamini bulan kod.

        Scanner scanner = new Scanner(System.in);

        int toplam=0;

        for(int i=1;i<500;i++){
            toplam+=i;
        }

        System.out.println("1'den 500'e kadar olan sayilarin toplami:" + toplam);

        scanner.close();


    }
}
