public class AsalSayılar {
    public static void main(String[] args) {
        for (int sayi = 1; sayi <= 50; sayi++) {
            boolean asalMi = true;
            
            for (int bolen = 2; bolen < sayi; bolen++) {
                if (sayi % bolen == 0) {
                    asalMi = false;
                    break;
                }
            }
            
            if (asalMi) {
                System.out.println(sayi + " asal.");
            }
        }  // Dış döngü BU satırda bitiyor!
    }
}