// Palindrom number yes or not 
// 5225 --------> after reverse --------> 5225 ---------> Palindrome yes
// 4564 --------> after reverse --------> 4654 ---------> Palindrome not

package TS_NAMAN.TS_JAVA.Control_Statment.loopss.Patterns.Pyramid.while_loopppp;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int n;
        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int z = n;
        while (n > 0){
            a = (a*10) + n % 10;
            n = n /10;
        }
        
        if (a == z){
            System.out.println("Palindrome yes");
        }
        else{
            System.out.println("Palindrome NO");
        
        }
    }
}
