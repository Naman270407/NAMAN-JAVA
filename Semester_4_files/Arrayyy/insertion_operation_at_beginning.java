// perform insertion operation at array
// insertion at beginning
package Semester_4_files.Arrayyy;

import java.util.Scanner;

public class insertion_operation_at_beginning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();

        int arr[] = new int[n+1];
        System.out.println("Enter array elements : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter new element to insert : ");
        int temp = sc.nextInt();

        for(int i = n; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        System.out.println("New Array : ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
