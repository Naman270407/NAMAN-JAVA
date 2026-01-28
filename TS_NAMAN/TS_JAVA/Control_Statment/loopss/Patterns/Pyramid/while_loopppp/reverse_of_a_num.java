// //  Find Reverse of a Number

package TS_NAMAN.TS_JAVA.Control_Statment.loopss.Patterns.Pyramid.while_loopppp;

import java.util.Scanner;

public class reverse_of_a_num {
    public static void main(String[] args) {
        int n;
        int r = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        while (0 < n) {
            r = r * 10 + (n % 10);
            n = n / 10;
        }
        System.out.print(r);

    }
}

// while(n > 0){
// r = n % 10; // get last digit
// reverse = reverse * 10 + r; // build reverse number
// n = n / 10; // remove last digit
// }
// System.out.println("Reverse = " + reverse);
