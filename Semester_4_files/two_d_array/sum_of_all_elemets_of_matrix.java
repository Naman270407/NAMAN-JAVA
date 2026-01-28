package Semester_4_files.two_d_array;

import java.util.Scanner;

public class sum_of_all_elemets_of_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int sum = 0;

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
                sum = sum + a[i][j];
            }
        }

        System.out.println("Sum of all elements of matrix = " + sum);
    }
}
