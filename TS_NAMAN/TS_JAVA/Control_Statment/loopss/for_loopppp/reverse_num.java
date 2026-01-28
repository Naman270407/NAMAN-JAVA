// reverse the num

package TS_NAMAN.TS_JAVA.Control_Statment.loopss.for_loopppp;

import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        int n;
        int rev = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        for(; n>0; n=n/10) {
            rev = rev * 10 + (n % 10); 
        }
        System.out.println("Reverse = " + rev);
    }
}
