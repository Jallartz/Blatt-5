package h3;
public class h3 {
    public static void main(String[] args) {

        int[][] einheiten = {
                {50000, 20000, 10000, 5000, 2000, 1000, 500,
                        200, 100, 50, 20, 10, 5, 2, 1},
                {0,     0,     0,     0,    0,    0,   0,
                        0,   0,   0,  0,  0, 0, 0, 0}
        };

        int input = 6279;
        int rest = input;

        for (int i = 0; i < einheiten[0].length; i++) {
            int wert = einheiten[0][i];

            if (rest >= wert) {
                int anzahl = rest / wert;         
                einheiten[1][i] = anzahl;
                rest = rest - anzahl * wert;
            }
        }

        System.out.println("Betrag: " + input + " Cent");
        System.out.println("Zerlegung in möglichst wenige Scheine/Münzen:");

        for (int i = 0; i < einheiten[0].length; i++) {
            int wert = einheiten[0][i];
            int anzahl = einheiten[1][i];
            if (anzahl > 0) {
                System.out.println(anzahl + " x " + wert + " Cent");
            }
        }

        System.out.println("Restbetrag nach Zerlegung: " + rest + " Cent");
    }
}
