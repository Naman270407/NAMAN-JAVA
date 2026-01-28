package JAVA_PRG.Stringsss;
import java.util.Scanner;
public class Equaliy_of_two_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = new String();
        System.out.println("Enter first String : ");
        str1 = sc.nextLine();
        String str2 = new String();
        System.out.println("Enter second String : ");
        str2 = sc.nextLine();
        if(str1.equals(str2)){
            System.out.println("Both Strings are equal");
        }
        else{
            System.out.println("Both Strings are not equal");
        }
    
}
}
