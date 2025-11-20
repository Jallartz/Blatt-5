public class h3 {
    public static void main(String[] args) {

        // einheiten[0][i] = Wert der Einheit in Cent
        // einheiten[1][i] = Stückzahl
        int[][] einheiten = {
                {50000, 20000, 10000, 5000, 2000, 1000, 500,
                        200, 100, 50, 20, 10, 5, 2, 1},
                {0,     0,     0,     0,    0,    0,   0,
                        0,   0,   0,  0,  0, 0, 0, 0}
        };

        int input = 6279; // Beispielwert in Cent (hier 62,79 €)

        int rest = input;

        for (int i = 0; i < einheiten[0].length; i++) {
            int wert = einheiten[0][i];

            if (rest >= wert) {
                int anzahl = rest / wert;         // wie oft dieser Schein/diese Münze
                einheiten[1][i] = anzahl;
                rest = rest - anzahl * wert;
            }
        }

        // Optional: Ausgabe zur Kontrolle
        System.out.println("Betrag: " + input + " Cent");
        System.out.println("Zerlegung in möglichst wenige Scheine/Münzen:");

        for (int i = 0; i < einheiten[0].length; i++) {
            int wert = einheiten[0][i];
            int anzahl = einheiten[1][i];
            if (anzahl > 0) {
                System.out.println(anzahl + " x " + wert + " Cent");
            }
        }

        // rest sollte hier 0 sein, falls alles korrekt
        System.out.println("Restbetrag nach Zerlegung: " + rest + " Cent");
    }
}
