public class h2 {
    public static void main(String[] args) {

        int n = 299;      // Beispielwert, kannst du ändern
        int digits = 0;

        int[] a = new int[9];  // automatisch mit 0 vorbelegt

        int temp = n;

        if (temp == 0) {
            digits = 1;
            a[8] = 0;          // ganz rechts die einzige Ziffer 0
        } else {
            int index = 8;     // wir füllen von rechts nach links
            while (temp > 0 && index >= 0) {
                int ziffer = temp % 10;
                a[index] = ziffer;
                temp = temp / 10;
                index--;
                digits++;
            }
            // die restlichen linken Zellen bleiben 0 (waren es schon)
        }

        System.out.println("n = " + n);
        System.out.println("digits = " + digits);

        System.out.print("Array a: ");
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
