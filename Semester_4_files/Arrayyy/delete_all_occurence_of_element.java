package Semester_4_files.Arrayyy;

import java.util.*;

public class delete_all_occurence_of_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element you want to delete:");
        int dl = sc.nextInt();

        int k = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != dl) {
                arr[k] = arr[i];
                k++;
            }
        }

        System.out.println("Array after deleting all occurrences:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
