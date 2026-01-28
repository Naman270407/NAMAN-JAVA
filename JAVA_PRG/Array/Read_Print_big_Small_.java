// Read and print a 1D array
// Find smallest and largest in array
package JAVA_PRG.Array;

import java.util.Scanner;

public class Read_Print_big_Small_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, min, max, n;
        int x[] = new int[100];

        // Read n
        System.out.print("\nEnter n: ");
        n = sc.nextInt();

        // Read Array
        System.out.println("\nEnter array elements: ");
        for (i = 0; i < n; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = sc.nextInt();
        }

        // Print Array
        System.out.println("\nArray is: ");
        for (i = 0; i < n; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }

        // Find min and max
        min = x[0];
        max = x[0];
        for (i = 0; i < n; i++) {
            if (x[i] > max)
                max = x[i];
            if (x[i] < min)
                min = x[i];
        }

        System.out.println("\nMax = " + max);
        System.out.println("Min = " + min);

        sc.close();
    }
}
