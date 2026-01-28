package Semester_4_files.Arrayyy;

import java.util.Scanner;

public class traversing_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        int arr [] = new int[n];
        System.out.println("Enter elements : ");
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements are : ");
        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }
}
