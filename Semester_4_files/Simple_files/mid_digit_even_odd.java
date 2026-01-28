// user input a number
// no. of digit
// sum of digits
// middle digit is even or odd

package Semester_4_files.Simple_files;

import java.util.Scanner;

public class mid_digit_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int tpp = num;
        int count = 0;
        int sum = 0;

        while (tpp != 0) {
            int digit = tpp % 10;
            sum = sum + digit;
            count = count +1;
            tpp = tpp / 10;
        }

        System.out.println("Number of digits = " + count);
        System.out.println("Sum of digits = " + sum);

        tpp = num;
        int mid_digit = count / 2;

        for (int i = 0; i < mid_digit; i++) {
            tpp = tpp / 10;
        }

        int middleDigit = tpp % 10;

        System.out.println("Middle digit = " + middleDigit);

        if (middleDigit % 2 == 0) {
            System.out.println("Middle digit is Even");
        } else {
            System.out.println("Middle digit is Odd");
        }

    }
}
