public class number_matrix {
    public static void main(String[] args) {
        int num = 1;

        for (int i = 1; i <= 3; i++) { // 3 rows
            for (int j = 1; j <= 3; j++) { // 3 columns
                System.out.print(num + " ");
                num++;
            }
            System.out.println(); // New line after each row
        }
    }
}

// public class number_matrix {
// public static void main(String[] args) {
// int count = 1;

// for (int i = 0; i < 3; i++) {
// for (int j = 1; j <= 3; j++)
// System.out.print(count++);
// System.out.println();
// }

// }
// }
