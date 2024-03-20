import java.util.Scanner;
public class question21 {
    public static void main(String[] args) {
        // 1-100 arasindaki cift sayilarin toplaminin mukemmel sayi olup olmadigini bulan kod.

        Scanner scanner = new Scanner(System.in);

        int toplam=0;
        for(int i=1;i<100;i++){
            if(i%2==0){
                toplam+=i;
            }
        }

        int bolenToplam=0;
        for(int i=1;i<toplam;i++){
            if(toplam%i==0){
                System.out.println("Toplam mukemmel sayidir.");
            }
            else{
                System.out.println("Toplam mukemmel sayi degildir.");
            }
        }

        scanner.close();

    }
}
