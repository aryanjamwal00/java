import java.util.Arrays;
import java.util.Scanner;

public class RiptideTokenGame {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {
                int[] tokens = new int[3];
                tokens[0] = sc.nextInt();
                tokens[1] = sc.nextInt();
                tokens[2] = sc.nextInt();

                // Sort array so tokens[0] <= tokens[1] <= tokens[2]
                Arrays.sort(tokens);

                if (tokens[0] == tokens[1] || tokens[1] == tokens[2]) {
                    System.out.println(0);
                } else {
                    // Math operations: subtraction (-) and Math.min()
                    int diff1 = tokens[1] - tokens[0];
                    int diff2 = tokens[2] - tokens[1];
                    int result = Math.min(diff1, diff2);

                    System.out.println(result);
                }
            }

            sc.close();
    }
}
