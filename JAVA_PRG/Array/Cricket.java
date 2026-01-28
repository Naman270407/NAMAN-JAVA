


package JAVA_PRG.Array;
public class Cricket {
    public static void main(String[] args) {
    
        // Step 1: Store runs scored on each ball
        int[] runs = {1, 4, 0, 6, 2, 0};

        int totalRuns = 0;
        int dotBalls = 0;
        int highestRun = runs[0];

        // Step 2: Process each ball
        for (int run : runs) {
            totalRuns += run; // add runs to total
            if (run == 0) {
                dotBalls++; // count dot balls
            }
            if (run > highestRun) {
                highestRun = run; // update highest run
            }
        }

        // Step 3: Display results
        System.out.println("Total runs scored in the over: " + totalRuns);
        System.out.println("Number of dot balls: " + dotBalls);
        System.out.println("Highest run scored on a single ball: " + highestRun);
    }
}
