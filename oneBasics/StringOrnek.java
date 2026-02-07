public class StringOrnek {
    public static void main(String [] args) {
        String cumle = "Java Ogreniyorum" ;

        //uzunluk
        System.out.println("Uzunluk: " + cumle.length());

        System.out.println("Büyük harf: " + cumle.toUpperCase());

        System.out.println("Küçük harf: " + cumle.toLowerCase());

        System.out.println("İlk harf: " + cumle.charAt(0));

        // ilk 4 karakter
        System.out.println("İlk 4 harf: " + cumle.substring(0, 4));

        // karşılaştırma
        String diger = "Java Ogreniyorum";
        System.out.println("Aynı mı ? " + cumle.equals(diger));

    }

}
