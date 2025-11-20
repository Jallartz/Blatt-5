package p2;
public class p2 {
    public static void main(String[] args) {

        
        int[] numbers = {4, 2, 3, 4, 1};

        int max = numbers[0];    
        int minIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                minIndex = i;
            }
        }

        System.out.println("max = " + max);
        System.out.println("minIndex = " + minIndex);
    }
}
