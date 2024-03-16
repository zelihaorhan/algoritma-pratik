import java.util.Scanner;
import java.util.Calendar;
public class question5 {
    public static void main(String[] args) {
        // dogum tarihi girilen kisinin yasini hesaplayan kod

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dogum tarihini giriniz:");

        int dYil=scanner.nextInt();

        Calendar calendar=Calendar.getInstance();

        //mevcut yili alalim

        int mYil=calendar.get(Calendar.YEAR);

        //yas hesabi

        int yas = mYil-dYil;

        System.out.println("Yasiniz:" + yas);

        scanner.close();
        
    }
}
