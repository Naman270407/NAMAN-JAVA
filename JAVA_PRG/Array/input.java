package JAVA_PRG.Array;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        int []a = new int[6];
        Scanner sc = new Scanner (System.in);
        for(int i=0;i<a.length;i++){
            System.out.println("emter the num");
            a[i] = sc.nextInt();
        }
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }
        System.out.println();
        
    }
}
