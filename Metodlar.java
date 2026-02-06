public class Metodlar {

    //1.
    public static void selamVer(String isim) {
        System.out.println("Merhaba " + isim + "!");
    }

    //2.
    public static int topla(int a, int b){
        return a + b;
    }

    //3.
    public static boolean ciftMi(int sayi) {
        return sayi % 2 == 0;
    }

    //4.
    public static int enBuyukBul(int[] dizi) {
        int enBuyuk = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
        }
        return enBuyuk;
    }

    //5. 
    public static int faktoriyelHesapla(int sayi) {
        int sonuc= 1;
        for(int i = 1; i <= sayi; i++) {
            sonuc = sonuc * i;

        }
        return sonuc;
    }

    //Main metod
    public static void main(String[] args) {
        selamVer("Esra");

        int toplam = topla(10,20);
        System.out.println("Toplam: " + toplam);

        boolean miCift = ciftMi(7);
        System.out.println("7 çift mi? " + miCift);
        
        int[] sayilar = {10, 20, 30};
        int enBuyuk = enBuyukBul(sayilar);
        System.out.println("En Büyük: " + enBuyuk);

        int fSonuc = faktoriyelHesapla(6);
        System.out.println("Faktöriyel çarpım sonucu: " + fSonuc);
        }


}
