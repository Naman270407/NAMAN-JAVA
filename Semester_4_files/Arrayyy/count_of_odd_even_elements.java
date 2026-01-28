package Semester_4_files.Arrayyy;

import java.util.Scanner;

public class count_of_odd_even_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int even_count = 0;
        int odd_count = 0;

        for (int j = 0; j < arr.length; j++){
            if(arr[j] % 2 == 0){
                even_count = even_count + 1;
            }
            else{
                odd_count = odd_count + 1;
            }
        }

        System.out.println("Even elements in array = " + even_count);
        System.out.println("Odd elemets in array = " + odd_count);

    }
}
