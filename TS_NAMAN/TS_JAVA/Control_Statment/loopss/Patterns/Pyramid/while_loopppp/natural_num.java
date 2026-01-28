// Print first N natural number by while loop

package TS_NAMAN.TS_JAVA.Control_Statment.loopss.Patterns.Pyramid.while_loopppp;

import java.util.Scanner;

// public class natural_num {
//     public static void main(String[] args) {
//         int n = 1; // intialization
//         while (n <= 27) {
//             System.out.print(n + " ");
//             n++;
//         }
//     }
// }

public class natural_num {
    public static void main(String[] args) {
        int n = 1; // intialization
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number where you want to print natural number : ");
        int i = sc.nextInt();
        while (n <= i) {
            System.out.print(n + " ");
            n++;
        }
    }
}
