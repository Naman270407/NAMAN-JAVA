// 1 1 1 1 1 
// 2 2 2 2 
// 3 3 3 
// 4 4 
// 5 


package TS_NAMAN.TS_JAVA.Control_Statment.loopss.Patterns.Pyramid;

public class num_08 {
    public static void main(String[] args) {
        int k = 1;
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(k + " ");
            }
            k++;
            System.out.println();
        }
    }
}
