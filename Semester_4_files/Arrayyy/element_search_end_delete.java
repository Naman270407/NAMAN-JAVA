package Semester_4_files.Arrayyy;

import java.util.Scanner;

public class element_search_end_delete {
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

        int position = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == dl) {
                position = i;
                break;
            }
        }

        if (position == -1) {
            System.out.println("Element not found");
        } else {
            for (int i = position; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;

            System.out.println("Array after deletion:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
