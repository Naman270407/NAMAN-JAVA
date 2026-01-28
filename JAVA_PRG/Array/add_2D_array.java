package JAVA_PRG.Array;

public class add_2D_array {
    public static void main(String[] args) {
        int a[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
        int b[][] = { { 90, 80, 70 }, { 60, 50, 40 }, { 30, 20, 10 } };
        int c[][] = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
