

/*
 Pane tööle antud konspektis klass Pindalad.java
Loo uus klass, kus sinu klassimeetodid lasevad arvutada ruumalasid. Tekita loogika, et kui kolmandat atribuuti ei ole vaja, siis seda ei küsita.
Ära unusta kommenteerimist (nimi, aeg ja olulisemad sõlmed)
 */

public class H8 {

    public static void main(String[] args) {

        
    }

        public static double roopkylikS(String a, String h) {
        float alus = Float.parseFloat(a);
        float korgus = Float.parseFloat(h);
        double s = alus * korgus;
        return s;
        }
        
        public static double ristkylikS(String a, String h) {
        float alus = Float.parseFloat(a);
        float korgus = Float.parseFloat(h);
        double s = alus * korgus;
        return s;
        }
        
        public static double kolmnurkS(String a, String h) {
        float alus = Float.parseFloat(a);
        float korgus = Float.parseFloat(h);
        double s = alus * korgus/2;
        return s;
        }

    
}
