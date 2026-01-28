// calculator program by switch statement 
package TS_NAMAN.TS_JAVA.Control_Statment.switchhh;
import java.util.Scanner;
public class calculator_2_o {
    public static void main(String[] args){
        int a,b,ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number : ");
        a = sc.nextInt();
        System.out.print("Enter Second number : ");
        b = sc.nextInt();
        System.out.print("Select your choice ----");
        System.out.println("1 for addtition  .  2 for subtraction  ,  3 for multiply  ,  4 for divide");
        ch = sc.nextInt();
        switch(ch){
            case 1:
            System.out.println("Addition = " + (a+b));
            break;
            case 2:
            System.out.println("Subtraction = " + (a-b));
            break;
            case 3:
            System.out.println("Multiply = " + (a*b));
            break;
            case 4:
            System.out.println("Divide = " + (a/b));
            break;
            default:
            System.out.println("Invalid Choice...");
        }
    }
}
