// sum of array by giving input of array size and array number

package JAVA_PRG.Array;

import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            sum+=arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}


// import java.util.Scanner;

// public class DigitOperations {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         // Input number
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         int temp = num;
//         int count = 0;
//         int sum = 0;

//         // Count digits and sum of digits
//         while (temp != 0) {
//             int digit = temp % 10;
//             sum = sum + digit;
//             count++;
//             temp = temp / 10;
//         }

//         System.out.println("Number of digits = " + count);
//         System.out.println("Sum of digits = " + sum);

//         // Find middle digit
//         temp = num;
//         int midPos = count / 2;

//         for (int i = 0; i < midPos; i++) {
//             temp = temp / 10;
//         }

//         int middleDigit = temp % 10;

//         System.out.println("Middle digit = " + middleDigit);

//         // Check even or odd
//         if (middleDigit % 2 == 0) {
//             System.out.println("Middle digit is EVEN");
//         } else {
//             System.out.println("Middle digit is ODD");
//         }
//     }
// }
