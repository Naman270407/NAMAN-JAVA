

// import java.util.Scanner;

// public class Add_02 {
//     public static void main(String[] args) {
        // int a, b , sum;
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter First Number : ");
        // a = sc.nextInt();
        // System.out.print("Enter Second Number : ");
        // b= sc.nextInt();
        // sum = a+b;
        // System.out.print("Addition of a and b = " + sum);

//     }
// }

// WAP TO ACCEPT ANY ARRAY FROM USER AND DISPLAY IT.

// import java.util.*;
// class demoarray{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println(("Enter size of array : "));
// int size =sc.nextInt();
// int arr[] = new int[size];
// System.out.println(("Enter an element in array: "));
// for(int i = 0;i<size;i++){
// arr[i]=sc.nextInt();
// }
// System.out.println("An Array is :");
// for(int i = 0;i<size;i++){
// System.out.println(arr[i]);
// }
// }
// }

// WAP TO FIND ELEMENT FROM ARRAY BY USING LINER SEARCH.

// import java.util.Scanner;
// public class LinearSearch {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter size of array: ");
// int n = sc.nextInt();

// int[] arr = new int[n];
// System.out.println("Enter " + n + " elements:");
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// System.out.print("Enter element to search: ");
// int key = sc.nextInt();

// int count = 0;
// for (int i = 0; i < n; i++) {
// if (arr[i] == key) {
// count = count + 1;
// break;
// }
// }

// if (count == 0) {
// System.out.println("Element is not found");
// } else {
// System.out.println("Element is found ");
// }
// }
// }

// WAP TO FIND ELEMENT FROM ARRAY BY USING BINARY SEARCH.

// import java.util.Scanner;
// public class BinarySearch {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter size of array: ");
// int n = sc.nextInt();

// int[] arr = new int[n];
// System.out.println("Enter sorted elements:");
// for (int i = 0; i < n; i++) {
// arr[i] = sc.nextInt();
// }

// System.out.print("Enter element to search: ");
// int key = sc.nextInt();

// int low = 0, high = n - 1, pos = -1;

// while (low <= high) {
// int mid = (low + high) / 2;

// if (arr[mid] == key) {
// pos = mid;
// break;
// } else if (arr[mid] < key) {
// low = mid + 1;
// } else {
// high = mid - 1;
// }
// }

// if (pos == -1) {
// System.out.println("Element not found");
// } else {
// System.out.println("Element found at index: " + pos);
// }
// }
// }

// WAP TO FIND SECOND LARGEST NUMBER IN ARRAY
// import java.util.Scanner;
// public class SecondLargest {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter size of array: ");
// int size = sc.nextInt();
// int[] arr = new int[size];
// int max1=0;
// int max2=0;

// System.out.println("Enter elements of array:");
// for (int i = 0; i < size; i++) {
// arr[i] = sc.nextInt();
// }
// if(arr[0]>arr[1]){
// max1=arr[0];
// max2=arr[1];
// }
// else{
// max1=arr[1];
// max2=arr[0];
// }

// for(int i=3;i<arr.length;i++){
// if(arr[i]>max1){
// max2=max1;
// max1=arr[i];
// }
// else if(arr[i]>max2){
// max2=arr[i];
// }
// }
// System.out.println("Second Largest number in array is: "+max2);
// }
// }

// WAP to accept any array from user and find sum of elements of the array

// import java.util.*;
// class sum_of_array{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println(("Enter size of array : "));
// int size =sc.nextInt();
// int arr[] = new int[size];
// System.out.println(("Enter an element in array: "));
// for(int i = 0;i<size;i++){
// arr[i]=sc.nextInt();
// }
// System.out.println("An Array is :");
// for(int i = 0;i<size;i++){
// System.out.println(arr[i]);
// }
// int sum = 0;
// for(int i = 0;i<size;i++){
// sum = sum + arr[i];
// }
// System.out.println("Sum of array is : "+sum);
// }
// }

// WAP to accept any array from user and find product of elements of the array
// import java.util.*;
// class product_of_array{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println(("Enter size of array : "));
// int size =sc.nextInt();
// int arr[] = new int[size];
// System.out.println(("Enter an element in array: "));
// for(int i = 0;i<size;i++){
// arr[i]=sc.nextInt();
// }
// System.out.println("An Array is :");
// for(int i = 0;i<size;i++){
// System.out.println(arr[i]);
// }
// int pro =1;
// for(int i = 0;i<size;i++){
// pro = pro * arr[i];
// }
// System.out.println("Product of array is : "+pro);
// }
// }

// // Selection Sort array

// import java.util.*;
// class Selection_Sort_array{
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println(("Enter size of array : "));
// int size =sc.nextInt();
// int arr[] = new int[size];
// System.out.println(("Enter an element in array: "));
// for(int i = 0;i<size;i++){
// arr[i]=sc.nextInt();
// }
// System.out.println("Unsorted array is :");
// for(int i = 0;i<size;i++){
// System.out.println(arr[i]);
// }
// int t=0;
// for(int i=0;i<size-1;i++){
// for(int j=i+1;j<size;j++){
// if(arr[i] > arr[j]){
// t=arr[i];
// arr[i]=arr[j];
// arr[j]=t;
// }
// }
// }
// System.out.println("Sorted array is :");
// for(int i = 0;i<size;i++){
// System.out.println(arr[i]);
// }
// }
// }


