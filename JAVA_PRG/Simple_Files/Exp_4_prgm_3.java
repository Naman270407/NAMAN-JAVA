public class Exp_4_prgm_3 {
    public static void main(String[] args) {
        int n = 5; // number of rows

        for (int i = 1; i <= n; i++) { // loop for rows
            for (int j = 1; j <= n; j++) { // loop for columns
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
