import java.util.Scanner;
public class question15 {
    public static void main(String[] args) {
        // Carpim tablosunun kod.

        Scanner scanner = new Scanner(System.in);

        for(int i=1;i<=10;i++){
            for(int j=1;j<10;j++){
                System.out.println(i + "x" + j + "=" + i*j);
            }
        }

        scanner.close();

    }
}
