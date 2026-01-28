package files;
import java.util.Scanner;

public class Sum_of_digit_until_single_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
            }
            num = sum;
        }
        System.out.println("sum single digit= " + num);
    }
}
