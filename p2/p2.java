public class p2 {
    public static void main(String[] args) {

        // Beispiel-Initialisierung (kannst du ändern)
        int[] numbers = {4, 2, 3, 4, 1};

        int max = numbers[0];    // sinnvoll: mit erstem Array-Wert starten
        int minIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                minIndex = i;
            }
            // Bei == max NICHT updaten, so bleibt der kleinste Index erhalten
        }

        System.out.println("max = " + max);
        System.out.println("minIndex = " + minIndex);
    }
}
