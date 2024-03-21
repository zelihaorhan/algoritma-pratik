import java.util.Scanner;
public class question25 {
    public static void main(String[] args) {
        // Girilen a ve b sayisi 50'den buyuk oldugunda c=a+b islemini yapan degilse bu sayilar uygun degil yazdiran kod.

        Scanner scanner=new Scanner(System.in);

        System.out.print("a sayisini giriniz:");
        int a=scanner.nextInt();

        System.out.print("b sayisini giriniz:");
        int b=scanner.nextInt();

        if(a>50&&b>50){
            System.out.println("c:" + (a+b));
        }
        else{
            System.out.println("Bu sayilar uygun degildir.");
        }

        scanner.close();

    }
}
