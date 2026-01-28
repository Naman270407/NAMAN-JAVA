// Count occurrence of all given numbers in an array

package Semester_4_files.Arrayyy;

import java.util.Scanner;

public class occur_of_number_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        boolean num[] = new boolean[n];

        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            num[i] = false;
        }

        int count = 0;

        for (int j = 0; j < arr.length; j++) {

            if (num[j] == true) {
                continue;
            }

            count = 1;

            for (int k = j + 1; k < arr.length; k++) {
                if (arr[j] == arr[k]) {
                    num[k] = true;
                    count = count + 1;
                }
            }
            System.out.println("Occurence of " + arr[j] + " is " + count + " times.");
        }
    }
}

