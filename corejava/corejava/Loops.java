package corejava;

public class Loops {

    public static void main(String[] args) {
        // While Loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

// Do While Loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 3);

// For Loop
        for (int k = 0; k < 3; k++) {
            System.out.println(k);
        }

// Enhanced For Loop
        int[] arr = {1, 2, 3};
        for (int val : arr) {
            System.out.println(val);
        }

    }
}
