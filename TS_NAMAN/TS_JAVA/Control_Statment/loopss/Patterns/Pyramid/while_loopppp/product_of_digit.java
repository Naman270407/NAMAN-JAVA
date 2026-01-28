// Find Product of Digits
// 2546 ---------> 2*5*4*6 or 6*4*5*2 --------> 240

package TS_NAMAN.TS_JAVA.Control_Statment.loopss.Patterns.Pyramid.while_loopppp;

import java.util.Scanner;
public class product_of_digit {
    public static void main(String[] args) {
        int n, product = 1;
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        while(n > 0){
            a = n % 10;
            product = product * a;            
            n = n/10;

        }
        System.out.println("Product of digit = " + product);
    }
}
