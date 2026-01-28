package Semester_4_files.Arrayyy;

import java.util.Scanner;

public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();

        int arr [] = new int[n];

        System.out.println("Enter elements : ");
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to search : ");
        int searchh = sc.nextInt();

        boolean found = false;

        for (int i=0; i < n; i++){
            if(arr[i] == searchh){
                System.out.println("at position : " + (i + 1));
                found = true;
                break;
            }
        }

        if(found == false){
            System.out.println("Element not found");
        }

    }
    
}


// Linear Search is a searching technique in which each element is checked
//  sequentially until the desired element is found or the list ends.