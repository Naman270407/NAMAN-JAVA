// Check a Number is Prime or Not
// prime number ----> which divided by itself and only 1 or which have only two factors are calles prime nubmber.

package TS_NAMAN.TS_JAVA.Control_Statment.loopss.Patterns.Pyramid.while_loopppp;

import java.util.Scanner;
public class prime_or_not {
    public static void main(String[] args) {
        int n;
        int count =0;
        int a =1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        while(n >= a){
            if(n % a == 0){
                count = count +1;
            }
            a++;
        }
        if(count == 2){
            System.out.println(n + " is a prime number.");
        }
        else{
            System.out.println(n + " is not a prime number.");
        }
    }
}
