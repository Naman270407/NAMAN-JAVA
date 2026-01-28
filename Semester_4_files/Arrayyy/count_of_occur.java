package Semester_4_files.Arrayyy;

import java.util.Scanner;

public class count_of_occur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number from array to count the occurence : ");
        int num = sc.nextInt();

        int count = 0;

        for ( int j = 0; j < arr.length; j++){
            if(arr[j] == num){
                count = count + 1;
            }
        }

        System.out.println("Occurance of the number " + num + " is = " + count);

    }
}
