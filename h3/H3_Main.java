package h3;

public class H3_Main {
    public static void main(String[] args) {

        int[][] einheiten = {
                {50000, 20000, 10000, 5000, 2000, 1000,
                 500, 200, 100, 50, 20, 10, 5, 2, 1},
                new int[15]
        };

        int input = 6279;
        int rest = input;

        for (int i = 0; i < 15; i++) {
            int w = einheiten[0][i];
            if (rest >= w) {
                einheiten[1][i] = rest / w;
                rest -= einheiten[1][i] * w;
            }
        }
    }
}
