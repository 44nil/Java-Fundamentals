public class MinMax {
    public static void main (String [] args) {
        int notlar [] = {85, 90, 78, 92, 88};

        int enBuyuk =  notlar[0];
        int enKucuk =  notlar[0];

        for(int i = 0; i < notlar.length; i++ ) {
            if(enBuyuk < notlar[i]) {
                enBuyuk = notlar[i];
            }

            if(enKucuk > notlar[i]) {
                enKucuk = notlar[i];
            }
        }
        System.out.println("En büyük not: " + enBuyuk);
        System.out.println("En küçük not: " + enKucuk);
        
    }
}
