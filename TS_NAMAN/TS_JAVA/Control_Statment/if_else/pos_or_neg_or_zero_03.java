// number is positive neggative or zero

package TS_NAMAN.TS_JAVA.Control_Statment.if_else;

import java.util.Scanner;

public class pos_or_neg_or_zero_03 {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        x = sc.nextInt();
        if (x > 0) {
            System.out.println(x + " is positive number. ");
        } else if (x == 0) {
            System.out.println("x is zero");
        } else {
            System.out.println(x + " is negative number.");
        }
    }
}
