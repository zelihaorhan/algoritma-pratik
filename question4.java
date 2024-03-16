import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        // 1' den 100'e kadar olan sayilarin kuplerinin toplamını bulan kod

        Scanner scanner = new Scanner(System.in);
        
        int toplam = 0;

        for(int i=1;i<100;i++){
            toplam+=(i*i*i);
        }

        System.out.println("1'den 100'e kadar olan sayilarin toplami:" + toplam);

        scanner.close();
    }
}
