public class NotSistemi {
    public static void main(String[] args) {
        int[] notlar = {85, 45, 78, 92, 35};
        String[] isimler = {"Ali", "Ayşe", "Mehmet", "Fatma", "Ahmet"};
        
        // 1. Tüm notları yazdır
        System.out.println("=== ÖĞRENCİ NOTLARI ===");
        for (int i = 0; i < notlar.length; i++) {
            System.out.println(isimler[i] + ": " + notlar[i]);
        }
        
        // 2. Ortalama hesapla
        double toplam = 0;
        for (int i = 0; i < notlar.length; i++) {
            toplam += notlar[i];
        }
        double ortalama = (double) toplam / notlar.length;
        
        // 3. En yüksek/düşük notu bul
        int enYuksek = notlar[0];
        int enDusuk = notlar[0];
        
        for (int i = 1; i < notlar.length; i++) {
            if (notlar[i] > enYuksek) {
                enYuksek = notlar[i];
            }
            if (notlar[i] < enDusuk) {
                enDusuk = notlar[i];
            }
        }
        
        // 4. Kaç kişi geçti/kaldı
        int gecenSayisi = 0;
        int kalanSayisi = 0;
        for (int i = 0; i < notlar.length; i++) {
            if (notlar[i] >= 50) {
                gecenSayisi++;
            } else {
                kalanSayisi++;
            }
        }

        // 5. Her öğrenci için durum
        System.out.println("\n=== ÖĞRENCİ DURUMLARI ===");
        for (int i = 0; i < notlar.length; i++) {
            String durum = (notlar[i] >= 50) ? "GEÇTİ" : "KALDI";
            System.out.println(isimler[i] + ": " + notlar[i] + " - " + durum);
        }
        
        // 5. Özet yazdır
        System.out.println("\n=== ÖZET ===");
        System.out.println("Ortalama: " + ortalama);
        System.out.println("En yüksek: " + enYuksek);
        System.out.println("En düşük: " + enDusuk);
        System.out.println("Geçen: " + gecenSayisi);
        System.out.println("Kalan: " + kalanSayisi);
    }
}