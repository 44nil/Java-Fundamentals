import java.util.Scanner;

public class TahminOyunu {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int gizliSayi = 42;
        int tahmin = 0;
        int denemeSayisi = 0;

        System.out.println("1-100 arası bir sayı tuttum!");

        while (tahmin != gizliSayi) {
            System.out.print("Tahminin: ");
            tahmin = scanner.nextInt();
            denemeSayisi++;

            if (tahmin < gizliSayi) {
                System.out.println("Daha büyük!");
            } else if (tahmin > gizliSayi) {
                System.out.println("Daha küçük!");
            } else {
                System.out.println("DOĞRU!" + denemeSayisi + " denemede buldun!");
            }
        }
        scanner.close();

    }
}
