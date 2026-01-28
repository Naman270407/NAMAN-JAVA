// print n number of fibonacci series
// Fibonacci series ek sequence hoti hai jisme har number = previous 2 numbers ka sum.
// Start: 0, 1
// Next = 0+1=1, 1+1=2, 1+2=3, 2+3=5, …
// 0, 1, 1, 2, 3, 5, 8, 13, 21, ...

package TS_NAMAN.TS_JAVA.Control_Statment.loopss.Patterns.Pyramid.while_loopppp;

import java.util.Scanner;
public class fibnocci_series {
    public static void main(String[] args) {
        int n;
        int a=0,b=1,c=0;         // a=0------starting with o of series and then 1 so b =1 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter max value of series : ");
        n = sc.nextInt();
        while (c <= n){
            System.out.println(c);
            a =b;
            b =c;
            c =a+b;
        }
    }
}
