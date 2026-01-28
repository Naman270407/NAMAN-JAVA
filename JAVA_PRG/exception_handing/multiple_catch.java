package JAVA_PRG.exception_handing;

public class multiple_catch {
    
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: Division by zero!");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: Index out of range!");
        }

        catch (Exception e) {
            System.out.println("General Exception occurred!");
        }

        System.out.println("Program continues normally...");
    }
}
