package h2;
public class h2 {
    public static void main(String[] args) {

        int n = 299;      
        int digits = 0;

        int[] a = new int[9]; 
        int temp = n;

        if (temp == 0) {
            digits = 1;
            a[8] = 0;        
        } else {
            int index = 8;     
            while (temp > 0 && index >= 0) {
                int ziffer = temp % 10;
                a[index] = ziffer;
                temp = temp / 10;
                index--;
                digits++;
            }
            
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
