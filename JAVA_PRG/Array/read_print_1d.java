package JAVA_PRG.Array;
  import java.util.Scanner;
public class read_print_1d {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array ka size lena
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Array create karna
        int arr[] = new int[n];

        // Array me values dalna
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Array print karna
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

