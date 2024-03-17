import java.util.Scanner;
public class question13 {
    public static void main(String[] args) {
        // 10 ile 1000 arasindaki tam kare sayilari ekrana yazan kod
        
        Scanner scanner = new Scanner(System.in);

        

        for(int i=10;i<=1000;i++){
            int karekok=(int)Math.sqrt(i);
            if(karekok*karekok==i){
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
