// Maximum number between three number 

package TS_NAMAN.TS_JAVA.Control_Statment.if_else;
import java.util.Scanner;
public class Max_num_01 {
    public static void main(String [] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        a = sc.nextInt();
        System.out.println("Enter Second number : ");
        b = sc.nextInt();
        System.out.println("Enter third number : ");
        c = sc.nextInt();
        if (a > b && a > c){
            System.out.println(a + "is maximum number.");
        }
        else if (b > c){
            System.out.println(b + " is maximum number.");
        }
        else {
            System.out.println(c + " is maximum number.");
        }
    }
}
