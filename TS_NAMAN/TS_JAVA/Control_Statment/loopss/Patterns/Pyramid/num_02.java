// 1 
// 2 2 
// 3 3 3 
// 4 4 4 4 
// 5 5 5 5 5

package TS_NAMAN.TS_JAVA.Control_Statment.loopss.Patterns.Pyramid;

import java.util.Scanner;
public class num_02 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
