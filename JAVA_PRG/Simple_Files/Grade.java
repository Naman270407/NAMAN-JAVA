import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        int m1, m2, m3;
        int rollno;
        String name;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Roll no of student : ");
        rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name of student :");
        name = sc.nextLine();

        System.out.print("Enter the marks of First subject :");
        m1 = sc.nextInt();

        System.out.print("Enter the marks of Second subject :");
        m2 = sc.nextInt();

        System.out.print("Enter the marks of Third subject :");
        m3 = sc.nextInt();

        int sum = m1 + m2 + m3;
        int average = sum / 3;

        if (average >= 90) {
            System.out.println("Grade A");
        }

        else if (average >= 80 && average < 90) {
            System.out.println("Grade B");
        }

        else if (average >= 70 && average < 80) {
            System.out.println("Grade C");
        }

        else if (average >= 60 && average < 70) {
            System.out.println("Grade D");
        }

        else if (average < 60) {
            System.out.println("Grade E");
        }

        else {
            System.out.println("You enterd wrong numbers ");
        }

    }
}
