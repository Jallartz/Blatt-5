public class p1 {
    public static void main(String[] args) {

        // Original:
        // int x = 0;
        // while (x <= 10) {
        //     x = x + 1;
        //     System.out.println(x);
        // }

        // (a) Entsprechende for-Schleife: gleiche Ausgabe (1 bis 11)
        for (int x = 1; x <= 11; x++) {
            System.out.println(x);
        }

        System.out.println("---");

        // (b) Entsprechende do-while-Schleife: gleiche Ausgabe (1 bis 11)
        int x = 0;
        do {
            x = x + 1;
            System.out.println(x);
        } while (x <= 10);
    }
}
