package h2;

public class H2_Main {
    public static void main(String[] args) {

        int n = 299;
        int digits = 0;
        int[] a = new int[9];

        if (n == 0) {
            digits = 1;
            a[8] = 0;
        } else {
            int temp = n;
            int index = 8;
            while (temp > 0) {
                a[index] = temp % 10;
                temp /= 10;
                index--;
                digits++;
            }
        }
    }
}
