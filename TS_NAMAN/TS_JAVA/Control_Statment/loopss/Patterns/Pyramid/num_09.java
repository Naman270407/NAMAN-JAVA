// 2 3 4 5 6 
// 3 4 5 6
// 4 5 6
// 5 6
// 6

package TS_NAMAN.TS_JAVA.Control_Statment.loopss.Patterns.Pyramid;

public class num_09 {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k+j + " ");
            }
            k++;
            System.out.println();
        }
    }
}
