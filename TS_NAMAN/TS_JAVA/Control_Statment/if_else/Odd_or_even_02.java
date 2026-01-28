// even number or odd

package TS_NAMAN.TS_JAVA.Control_Statment.if_else;
import java.util.Scanner;

public class Odd_or_even_02 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println(n + "is even number.");
        }
        else {
            System.out.println(n + " is odd number.");
        }

    }
}
