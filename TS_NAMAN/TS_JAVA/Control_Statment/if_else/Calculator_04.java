// calculator program by if - else
package TS_NAMAN.TS_JAVA.Control_Statment.if_else;
import java.util.Scanner;

public class Calculator_04 {
    public static void main(String[] args) {
        int a,b,choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        a = sc.nextInt();
        System.out.print("Enter second number : ");
        b = sc.nextInt();
        System.out.print("Please Select your choice between them :");
        System.out.println("1 for add / 2 for subtract / 3 for multiply / 4 for divide / 5 for remainder");
        choice = sc.nextInt();
        if (choice == 1 ){
        System.out.print("Addition = " + (a+b));}
        else if (choice == 2){
            System.out.println("Subtraction = " + (a-b));
        }
        else if (choice ==3){
            System.out.println("Multiply = " + (a*b));
        }
        else if (choice ==4){
            System.out.println("Divide = " + (a/b));
        }
        else if (choice == 5){
            System.out.println("Remainder = " + (a%b));
        }
        else {
            System.out.println("You Entered invalid choice.");
        }
    }
}
