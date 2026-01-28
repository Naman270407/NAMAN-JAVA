package Semester_4_files.Arrayyy;

import java.util.Scanner;

public class deletion_operation_at_mid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter index of element to delete : ");
        int dl = sc.nextInt();

        for(int i = dl; i < n - 1; i++ ){
            arr[i] = arr[i + 1];
        }

        n--;  //for array size decrease

        System.out.println("New Array :");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
