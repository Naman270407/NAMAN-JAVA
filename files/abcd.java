package files;
// Example 1 (3-digit Armstrong)
// Number = 153
// Digits = 3
// Calculate:
// 1³ + 5³ + 3³ = 1 + 125 + 27 = 153 ✅
//👉 So 153 is Armstrong.

// Example 3 (4-digit Armstrong)
// Number = 9474
// Digits = 4
// yaml
// Copy code
// 9⁴ + 4⁴ + 7⁴ + 4⁴ = 6561 + 256 + 2401 + 256 = 9474 ✅

// sum = sum + (int) Math.pow(y, digit);// power formula for java

import java.util.Scanner;

public class abcd {
    public static void main(String[] args) {
        int n;
        int digit = 0;
        int a;
        int y;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        n = sc.nextInt();
        int z = n;
        int m = n;
        while (n > 0) {
            a = n % 10;
            digit = digit + 1;
            n = n / 10;
        }
        while (z > 0) {
            y = z % 10;
            sum = sum + (int) Math.pow(y, digit);
            z = z/10;
        }
        if (m == sum){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

}
