import java.util.Scanner;

public class YasKontrol {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yaşınızı girin:");
        int yas = scanner.nextInt();

        if (yas >= 18) {
            System.out.println("Ehliyet alabilrsiniz.");

        } else {
            System.out.println("Ehliyet için " + (18-yas) + " yıl daha beklemelisiniz.");

        }

        scanner.close(); 
        
    }
}
