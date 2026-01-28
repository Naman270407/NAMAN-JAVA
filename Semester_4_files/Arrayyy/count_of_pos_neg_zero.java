package Semester_4_files.Arrayyy;

import java.util.Scanner;

public class count_of_pos_neg_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Array size : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int positive_count = 0;
        int negative_count = 0;
        int zero_count = 0;

        for(int j = 0; j < arr.length; j++){
            if(arr[j] == 0){
                zero_count = zero_count + 1;
            }
            if(arr[j] > 0){
                positive_count = positive_count +1;
            }
            if(arr[j] < 0){
                negative_count = negative_count + 1;
            }
        }

        System.out.println("Positive number count in array : " + positive_count);
        System.out.println("Zero count in array : " + zero_count);
        System.out.println("Negative number count in array : " + negative_count);
    }
}
