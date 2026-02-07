import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adın ne:");
        String ad = scanner.nextLine();

        System.out.println("Yaşın kaç: ");;
        int yas = scanner.nextInt();

        System.out.println("Merhaba " + ad + "! Senin yaşın " + yas);

        scanner.close();
    }

}