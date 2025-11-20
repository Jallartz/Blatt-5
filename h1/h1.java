package h1;
public class h1 {
    public static void main(String[] args) {

       
        int[] myArray = {5, 6, 7, 10};

        int n = myArray.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[n - 1 - i];
            myArray[n - 1 - i] = temp;
        }

        for (int value : myArray) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
