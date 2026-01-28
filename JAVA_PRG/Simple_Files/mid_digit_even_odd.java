// user input a number 
// no. of digit 
// sum of digits
// middle digit is even or odd

package JAVA_PRG.Simple_Files;

import java.util.Scanner;

public class mid_digit_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;
        int tpp = num;
        int htt = num;
        
        while (num != 0) {
            sum = sum + num % 10;
            count = count + 1;
            num = num / 10;
        }
        System.out.println("No. of digits = " + count);
        System.out.println("sum of digits = " + sum);

        int mid = count / 2;
        int middle_digit;
        if (count % 2 == 0) {
            for (int i = 0; i <= mid; i++) {
                tpp = tpp / 10;
            }

            for (int j = 0; j < mid; j++) {
                htt = htt / 10;
            }

            middle_digit = ((tpp % 10) / (htt % 10)) / 2;
        }

        else {
            for (int i = 0; i < mid; i++) {
                tpp = tpp / 10;
            }

            middle_digit = tpp % 10;
        }

        // int midPos = count / 2;

        // int middleDigit = tpp % 10;

        System.out.println("Middle digit = " + middle_digit);

        if (middle_digit % 2 == 0) {
        System.out.println("Middle digit is EVEN");
        } else {
        System.out.println("Middle digit is ODD");
        }

    }
}
