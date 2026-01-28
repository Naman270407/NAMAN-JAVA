//  Find Factorial(!)of a Number
// 5! ---------> 5*4*3*2*1 = 120

package TS_NAMAN.TS_JAVA.Control_Statment.loopss.Patterns.Pyramid.while_loopppp;

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int n;
        int i =1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        while(n > 0){
            i = n*i;
            n--;
        }       
        System.out.println("Factorial is = " + i);        
    }
}
