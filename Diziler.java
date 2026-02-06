public class Diziler {
    public static void main(String [] args) {
        int[] notlar = {85, 90, 78, 92, 88} ;

        for (int i = 0; i < notlar.length; i++) {
            System.out.println("öğrenci" + (i+1) + ": " + notlar[i]);
        }

        int toplam = 0;
        for (int i = 0; i < notlar.length; i++) {
            toplam += notlar[i];
        }

        double ortalama = (double) toplam / notlar.length;

        System.out.println("...");
        System.out.println("Ortalama: " + ortalama);
    }
}