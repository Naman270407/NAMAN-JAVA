// Find Sum of Digits of a Number
// 2469 ----------->    2+4+6+9 = 21  or 9+6+4+2 = 21

package TS_NAMAN.TS_JAVA.Control_Statment.loopss.Patterns.Pyramid.while_loopppp;
import java.util.Scanner;
public class sum_of_a_digit {
    public static void main(String[] args) {
        int n;
        int a;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        while(n > 0){
            a = n % 10;
            sum = sum + a;
            n = n/10;
        }
        System.out.print("Sum of digit = " + sum);

    }
}
