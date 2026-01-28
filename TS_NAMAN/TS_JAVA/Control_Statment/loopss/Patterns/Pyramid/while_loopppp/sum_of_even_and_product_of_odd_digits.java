// Find Sum of Even & Product of Odd Digits of a Number
// 4563 -----------> even_sum(4+6)= 10    and   odd_product(5*3)=15
// zero is even

package TS_NAMAN.TS_JAVA.Control_Statment.loopss.Patterns.Pyramid.while_loopppp;

import java.util.Scanner;

public class sum_of_even_and_product_of_odd_digits {
    public static void main(String[] args) {
        int n;
        int a, b = 0, c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        n = sc.nextInt();
        while (n > 0) {
            a = n % 10;
            if (a % 2 == 0) {
                b = b + a;
            } else {
                c = c * a;
            }
            n = n / 10;
        }
        System.out.println("Sum = " + b);
        System.out.println("Product = " + c);

    }
}
 

