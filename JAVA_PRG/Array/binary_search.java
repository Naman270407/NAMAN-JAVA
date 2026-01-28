package JAVA_PRG.Array;
import java.util.Scanner;
public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a[] = {10,20,30,40,50,60,70,80,90,100};
        int item;
        System.out.println("Enter the element you want to search ");
        item = sc.nextInt();
        int lb = 0;
        int ub = 9;
        int mid;
        while (lb <= ub) {
            mid = (lb + ub)/2;
            if(a[mid]==item)
            {
                System.out.println("Element found at ="+(mid+1));
                break;
            }
            else if(a[mid] > item)
            {
                ub = mid - 1;
            }
            else
            {
                lb = mid + 1;
            }
            
        }
    }
}
