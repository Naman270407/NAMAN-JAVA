// Find Sum of First N Natural Numbers by while loop

package TS_NAMAN.TS_JAVA.Control_Statment.loopss.Patterns.Pyramid.while_loopppp;

import java.util.Scanner;

public class sum_of_natural_num {
    public static void main(String[] args) {
        int n = 1;
        int i;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number whether you want to sum of natural number : ");
        i = sc.nextInt();
        while (n <= i) {
            sum = sum + n;
            n++;
        }
        System.out.println("sum of first n natural number = " + sum);
    }
}
