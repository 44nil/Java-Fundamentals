public class Isinma_iki {
    public static void main(String [] args) {
        int[] sayilar = {10, 20, 30, 40, 50};

        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++){
            toplam += sayilar[i];
        }

        double ortalama = (double) toplam / sayilar.length;
        System.out.println(ortalama);

    }
}