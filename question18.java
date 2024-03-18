import java.util.Scanner;
public class question18 {
    public static void main(String[] args) {
        // Fibonacci serisinin ilk 10 terimini ekrana basan kod.

        Scanner scanner = new Scanner(System.in);

        int sayi1=1;
        int sayi2=1;

        System.out.println(sayi1);
        System.out.println(sayi2);

        for(int i=0;i<8;i++){
            int temp=sayi1+sayi2;
            sayi1=sayi2;
            sayi2=temp;
            System.out.println(temp);
        }

        scanner.close();
    }
}
