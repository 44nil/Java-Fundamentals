public class Palindrome {
    public  static void main(String [] args) {
        String kelime = "aba";

        //Kelimenin tersini oluştur
        String ters = "";
        for (int i = kelime.length() - 1; i >= 0; i--) {
            ters += kelime.charAt(i);
        }

        System.out.println("Kelime: " + kelime);
        System.out.println("Ters: " + ters);

        // karşılaştır
        if (kelime.equals(ters)) {
            System.out.println("Palindrome!");
        } else {
            System.out.println("Palindorme değil!");
        }
    }
}
