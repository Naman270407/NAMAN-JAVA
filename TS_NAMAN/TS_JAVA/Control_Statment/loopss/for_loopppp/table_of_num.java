// table of a given number

package TS_NAMAN.TS_JAVA.Control_Statment.loopss.for_loopppp;

import java.util.Scanner;
public class table_of_num {
    public static void main(String[] args) {
        int n;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n= sc.nextInt();
        for (i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }    
}
