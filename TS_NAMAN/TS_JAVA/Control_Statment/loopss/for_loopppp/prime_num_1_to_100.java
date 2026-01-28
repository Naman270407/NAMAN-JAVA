// Prime number between 1 to 100

package TS_NAMAN.TS_JAVA.Control_Statment.loopss.for_loopppp;

public class prime_num_1_to_100 {
    public static void main(String[] args) {
        int i;                   // for outer loop 1---100
        int count;               // counting the factors
        int j;                   // for inner loop which module and gives remainder
        for(i = 1; i <=100; i++){
            count = 0;
            for(j = 1; j<=i; j++){
                if(i % j == 0){
                    count = count + 1;
                }
            }
            if (count == 2){
                System.out.print(i + " ");
            }
        }
    }
}
